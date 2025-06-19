import java.sql.*;
import java.util.logging.Logger;

public class SQLInjectionExample {
    private static final Logger logger = Logger.getLogger(SQLInjectionExample.class.getName());

    public static void main(String[] args) throws Exception {
        String userInput = "' OR '1'='1"; // input nguy hiểm
        String query = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "pass");
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, userInput);
            logger.info("Executing query: " + stmt);
            // ResultSet rs = stmt.executeQuery();
            // Xử lý kết quả...
        }
    }
}
