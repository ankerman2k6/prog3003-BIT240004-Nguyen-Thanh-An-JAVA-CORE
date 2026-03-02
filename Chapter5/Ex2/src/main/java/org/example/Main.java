package org.example;
import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final String URL =
            "jdbc:mysql://localhost:3306/simple_jdbc?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "An1552006@";
    public static void main(String[] args) throws SQLException {
        deleteUsers(1);
    }

    static void getAllUsers() throws SQLException {
        String sql = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("User list:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void deleteUsers(int id){
        String sql = "DELETE FROM users WHERE id=?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rowAffected = ps.executeUpdate();
            if (rowAffected == 0){
                System.out.println("K tìm thấy ID");
            }
            else {
                System.out.println("Đã xoá ID có id = " + id);
            }


        } catch (SQLException e) {
            System.out.println("Có lỗi xẩy ra");
            e.printStackTrace();
        }
    }
}