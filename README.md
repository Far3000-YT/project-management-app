# Project Management App (JavaFX)

This is a desktop application built with JavaFX for managing projects, tasks, and employees. It provides a graphical user interface that interacts with the [Project Management App API](https://github.com/Far3000-YT/project-management-app-api).

## ✨ Features

*   User Login and Signup.
*   View a list of all Projects and Employees.
*   Create, Read, Update, and Delete (CRUD) Projects.
*   Create, Read, Update, and Delete (CRUD) Employees.
*   View detailed information for selected Projects (description, deadline, priority, members, tasks).
*   View detailed information for selected Employees (name, associated projects).
*   Add/Manage members within a Project.
*   Add/Manage tasks within a Project.
*   Basic Kanban board view for tasks within a selected project (TODO, IN PROGRESS, DONE).

## 🎬 Demo

Here's a video demonstrating the application's functionality:

https://github.com/user-attachments/assets/6296ab17-cfb9-4f4c-b353-a322749cfe9d

*(Note: The demo showcases interaction with the locally running backend API and database).*

## 🛠️ Technology Stack

*   **Language:** Java 17
*   **Framework:** JavaFX
*   **Build Tool:** Maven
*   **HTTP Client:** Apache HttpClient 5
*   **JSON Processing:** Jackson Databind

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

*   Java Development Kit (JDK) 17 or later
*   Apache Maven
*   **A running instance of the [Project Management App API](https://github.com/Far3000-YT/project-management-app-api).** Please follow the setup instructions in that repository first.

## 🚀 Setup & Installation

1.  **Ensure the API is Running:**
    Make sure the `project-management-app-api` backend service is running (typically on `http://localhost:8080`). Refer to its README for setup instructions.

2.  **Clone the repository:**
    ```bash
    git clone https://github.com/Far3000-YT/project-management-app.git
    cd project-management-app
    ```

3.  **Build the Application:**
    Use Maven to build the project and download dependencies.
    ```bash
    mvn clean install
    ```

## ▶️ Running the Application

Once the API is running and the project is built, you can start the JavaFX application using Maven:

```bash
mvn javafx:run
```

This will launch the application window.

## 🖱️ Usage

1.  **Login/Signup:** Start by logging in with existing credentials or creating a new account using the "Create Account" link.
2.  **Main View:** After logging in, you'll see the main interface with lists for Projects and Employees.
3.  **Viewing Details:** Click on a project or employee in the respective lists to view their details in the right-hand panes.
4.  **CRUD Operations:** Use the buttons (`Create`, `Edit`, `Delete`) below the lists to manage projects and employees.
5.  **Project Management:**
    *   When a project is selected, you can view its details, members, and tasks.
    *   Use the `Add Member` button to assign an available employee to the project.
    *   Use the `Add Task` button to create a new task for the selected project.
    *   The Kanban board below the project details shows tasks categorized by status (TODO, IN PROGRESS, DONE).
6.  **Navigation:** Use the `File` menu to log out or exit the application.

---
*This application requires the [Project Management App API](https://github.com/Far3000-YT/project-management-app-api) to be running.*
