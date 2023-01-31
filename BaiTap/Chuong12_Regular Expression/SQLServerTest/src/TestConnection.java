import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("abc123!@#");
        ds.setServerName("DESKTOP-FJA9JF1\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QLBH");
        ds.setEncrypt(false);
        try (Connection conn = ds.getConnection()){
            System.out.println(conn.getMetaData());
            System.out.println("Connection success");
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
