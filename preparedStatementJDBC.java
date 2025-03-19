import java.sql.*;

public class preparedStatementJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "pass";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database!");

            // Insert data using PreparedStatement
            String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, "Bob");
            preparedStatement.setInt(2, 22);
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);

            // Retrieve data using PreparedStatement
            String selectQuery = "SELECT * FROM students WHERE age > ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, 20);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}