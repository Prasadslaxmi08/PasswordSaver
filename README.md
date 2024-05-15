# Password Saver

This project is a simple web application for saving passwords using Java Servlets and JSP. It features a user-friendly registration form with enhanced CSS styling for a professional look.

## Project Structure

### Files and Directories

- `src/`
  - `in.sp.backend/`
    - `Password.java`: Servlet handling the form submission and database interaction.
- `WebContent/`
  - `reg.jsp`: JSP file containing the registration form and its styling.

### Technologies Used

- **Java Servlets**: Backend logic to handle form submissions.
- **JSP (JavaServer Pages)**: Frontend for the registration form.
- **HTML/CSS**: Markup and styling for the registration form.
- **MySQL**: Database for storing user information.
- **Eclipse IDE**: Development environment.
- **Git/GitHub**: Version control and project hosting.

## Setup Instructions

### Prerequisites

- Java Development Kit (JDK)
- Apache Tomcat (or any servlet container)
- MySQL database
- Eclipse IDE with EE plugins

### Steps

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/password-saver.git
    ```
2. **Import the project into Eclipse**:
    - Open Eclipse.
    - Go to `File -> Import -> Existing Projects into Workspace`.
    - Select the cloned repository.

3. **Configure the MySQL Database**:
    - Ensure MySQL is running.
    - Create a database named `laxmi`.
    - Create a table with the following structure:
      ```sql
      CREATE TABLE pass (
          name VARCHAR(100),
          email VARCHAR(100),
          password VARCHAR(100)
      );
      ```

4. **Update Database Credentials**:
    - In `Password.java`, update the database URL, username, and password if necessary:
      ```java
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/laxmi", "root", "1234");
      ```

5. **Deploy the Application**:
    - Right-click on the project in Eclipse.
    - Select `Run As -> Run on Server`.
    - Choose Apache Tomcat and follow the prompts.

6. **Access the Application**:
    - Open your web browser and go to `http://localhost:8080/your-project-name/reg.jsp`.

## Usage

- Fill in the registration form with your Name, Email ID, and Password.
- Click "Submit" to save the details to the database.
- A success or error message will be displayed based on the operation result.

## Contribution

If you wish to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
