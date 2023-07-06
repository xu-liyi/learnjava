import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class CommonsLogging_cla {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLogging_cla.class);
        log.info("start...");
        log.warn("end.");
    }
}
