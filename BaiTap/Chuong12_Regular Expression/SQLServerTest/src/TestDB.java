import java.sql.*;

public class TestDB {
    public static void main(String[] args) {
        var url = "Jdbc:mysql://localhost:3306/mydatabase";
        var user = "root";
        var password = "";
        var sql  = "select * from qlbh";
        try(Connection conn = DriverManager.getConnection(url,user,password)) {
            System.out.println(conn.getCatalog() );
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            showInfo(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } ;
    }

    private static void showInfo(ResultSet rs) {
        try {
            while (rs.next()){
                System.out.println(rs.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
