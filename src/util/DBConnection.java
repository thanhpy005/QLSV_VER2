package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:database/QuanLy.db?busy_timeout=5000");
    }

    // Test nhanh
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Kết nối SQLITE thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
