import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseFunctions {

    //Main function used for quick testing
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/hospital";
        String user = "FSWE23";
        String pass = "raman";

        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
}