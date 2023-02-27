import java.sql.*;
import java.time.LocalDate;

public class databaseFunctions {

    final static String url = "jdbc:mysql://localhost:3306/hospital";
    final static String user = "FSWE23";
    final static String pass = "raman";

    //Main function used for quick testing
    public static void main(String[] args){

        add_Doctor("Dr Mundo", "GoesWhereIPleases", "Mundo", "Malpractice", "Cleaver.thrower@zaun.com");

        /* 
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Database connected!");
        } 
        catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        */
    }

    //Function used to create Admins
    public static void add_Admin(String username, String password){
        Connection connection = null;
        Statement statement = null;
        
        try{
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            statement.executeUpdate("insert into admins values('" + username + "', '" + password + "')");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally{
            try {
                statement.close();
                connection.close();
            } 
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    //Function used to create Doctors
    public static void add_Doctor(String username, String password, String name, String specialty, String email){
        Connection connection = null;
        Statement statement = null;
        
        try{
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            statement.executeUpdate("insert into doctors values('" + username + "', '" + password + "', '" + name + "', '" + specialty + "', '" + LocalDate.now() + "', '" + email + "')");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally{
            try {
                statement.close();
                connection.close();
            } 
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    //Function used to create Nurses
    public static void add_Nurse(String username, String password){
        Connection connection = null;
        Statement statement = null;
        
        try{
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            statement.executeUpdate("insert into nurses values('" + username + "', '" + password + "')");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally{
            try {
                statement.close();
                connection.close();
            } 
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    //Function used to create Patients
    public static void add_Patient(String username, String password){
        Connection connection = null;
        Statement statement = null;
        
        try{
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
            statement.executeUpdate("insert into patients values('" + username + "', '" + password + "')");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        finally{
            try {
                statement.close();
                connection.close();
            } 
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    //Function to login as Admin
    public static void adminLogIn(String username, String password){

    }

    //Function to login as Doctor
    public static void doctorLogIn(String username, String password){

    }

    //Function to login as Nurse
    public static void nurseLogIn(String username, String password){

    }

    //Function to login as Patient
    public static void patientLogIn(String username, String password){

    }
}