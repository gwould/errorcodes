import java.io.*;
import java.util.logging.Logger;

public class PathTraversalExample {
    private static final Logger logger = Logger.getLogger(PathTraversalExample.class.getName());

    public static void main(String[] args) throws IOException {
        String userInput = "input.txt"; // Giả sử lấy từ input an toàn

        // Chỉ cho phép file trong thư mục 'data'
        if (userInput.contains("..") || userInput.contains("/") || userInput.contains("\\")) {
            logger.warning("Invalid file path detected!");
            return;
        }

        File file = new File("data/" + userInput);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                logger.info("Reading file: " + file.getPath());
                // Đọc nội dung file nếu cần
            }
        } else {
            logger.warning("File does not exist.");
        }
    }
}
