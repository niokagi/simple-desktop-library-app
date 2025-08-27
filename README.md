# Simple Desktop Library Management System

![Language](https://img.shields.io/badge/Language-Java-blue.svg)
![Database](https://img.shields.io/badge/Database-MySQL-orange.svg)
![Platform](https://img.shields.io/badge/Platform-Desktop-lightgrey.svg)

A simple yet functional desktop application designed to manage a library's core operations, such as tracking books, managing members, and handling borrowing/returning processes. This application is built with **Java Swing** for the graphical user interface and connects to a **MySQL** database for data storage.


---

## Features

-   **Book Management**: Add new books, update existing book details, delete records, and search for books by title or author.
-   **Member Management**: Register new library members, update their information, and view the list of all members.
-   **Data Viewing**: Clean and organized tables to display lists of available books, registered members, and current borrowing records.

## Tech Stack

-   **Language**: Java
-   **GUI Toolkit**: Java Swing
-   **Database**: MySQL
-   **IDE**: Apache NetBeans

---

## Prerequisites

Before you begin, ensure you have met the following requirements:
-   Java Development Kit (JDK) 8 or newer
-   MySQL Server
-   Apache NetBeans IDE (dianjurkan)
-   [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) (JDBC Driver)

## Installation and Setup

Follow these steps to get the project running on your local machine:

1.  **Clone the Repository**
    ```sh
    git clone [https://github.com/your-username/simple-desktop-library-app.git](https://github.com/your-username/simple-desktop-library-app.git)
    ```
    *(Ganti `your-username` dan `simple-desktop-library-app`)*

2.  **Database Setup**
    -   Start your MySQL server.
    -   Create a new database (e.g., `library_db`).
    -   Import the `database_schema.sql` file (Anda perlu menyediakannya dari proyek Anda) into your new database. This will create all the necessary tables.

3.  **Configure Database Connection**
    -   Open the project in NetBeans.
    -   Navigate to the database connection configuration file (misalnya: `src/com/project/util/DatabaseConnector.java`).
    -   Update the database URL, username, and password to match your local MySQL setup.
    ```java
    private static final String URL = "jdbc:mysql://localhost:3306/library_db";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";
    ```

4.  **Add JDBC Driver**
    -   In NetBeans, right-click the "Libraries" folder in the project tree.
    -   Select "Add JAR/Folder".
    -   Navigate to and select the `mysql-connector-j-x.x.x.jar` file that you downloaded.

5.  **Build and Run**
    -   Right-click the project and select "Clean and Build".
    -   Once the build is successful, right-click the project again and select "Run" (atau jalankan file Main class-nya).

---

## Project Context

This application was originally developed as a personal learning project during my high school studies (September 2023). It served as a practical exercise to understand foundational concepts of object-oriented programming (OOP), GUI development with Java Swing, and database integration with JDBC.

This project is now archived here for portfolio and documentation purposes, showcasing an early milestone in my software development journey.
