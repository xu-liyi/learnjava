import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
public class JDKLogging_cla {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(JDKLogging_cla.class.getName());
        logger.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // 使用logger.severe()打印异常
            logger.severe(e.getMessage());
        }
        logger.info("Process end.");
    }
}
