import java.util.logging.Logger;

public class NullPointerExample {
    private static final Logger logger = Logger.getLogger(NullPointerExample.class.getName());

    public static void main(String[] args) {
        String text = null;
        if (text != null && text.length() > 0) {
            logger.info("Text is not empty");
        } else {
            logger.warning("text is null or empty");
        }
    }
}
