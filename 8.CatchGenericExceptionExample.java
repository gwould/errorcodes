import java.util.logging.Logger;

public class CatchGenericExceptionExample {
    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = null;
            logger.info("Length: " + s.length());
        } catch (NullPointerException e) {
            logger.severe("NullPointerException: " + e.getMessage());
        }
    }
}
