import java.util.Date;

/**
 * Created by nicolas on 21/03/15.
 */
public class Log {

    public static void console (String message) {
        System.out.println(new Date() + " - " + message);
    }

}
