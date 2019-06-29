package by.bntu.fitr.povt.jdbc.example1.case1;

import java.sql.*;

public class JDBC {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Driver driver = new com.mysql.cj.jdbc.Driver();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/internetshop","root", "root");
                PreparedStatement preparedStatement =conn.prepareStatement("SELECT * FROM internetshop.products");
                // Выполнение запроса
                ResultSet rs = preparedStatement.executeQuery();

                // Вывод результата запроса
                while (rs.next()) {
                    System.out.println("" + rs.getString("price"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
