import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataExample {
    public static void main(String[] args) {
        // JDBC database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false"; // Replace with your database name
        String username = "root";
        String password = "Bappa";

        // JDBC connection object
        Connection connection = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(url, username, password);

            // SQL statement to update data
            String updateSQL = "UPDATE users SET email = ? WHERE username = ?";

            // Create a prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);

            // Set new values for the placeholders in the SQL statement
            preparedStatement.setString(1, "shubham@gmail.com");
            preparedStatement.setString(2, "Shubham Maurya");

            // Execute the SQL statement to update the data
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's always closed
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
