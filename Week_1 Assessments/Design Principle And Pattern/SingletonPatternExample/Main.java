import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First Log");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second Log");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances exist.");
        }

        try {
            String url = "";
            String user = "";
            String pass = "";
            Connection normalConnection = DriverManager.getConnection(url, user, pass);
            Logger.getInstance().log("Connected with normal JDBC manually.");
            normalConnection.close();
        } catch (Exception e) {
        }
        try {
            Connection conn = DBConnectionManager.getInstance().getConnection();
            Logger.getInstance().log("Connected using Singleton DBConnectionManager.");
            conn.close();
        } catch (Exception e) {
        }

    }
}
