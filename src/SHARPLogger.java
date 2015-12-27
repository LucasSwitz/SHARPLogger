import java.io.PrintStream;

/**
 * Created by Administrator on 12/26/2015.
 */
public class SHARPLogger {

    private static final PrintStream out = System.out;


    public static void error(String message)
    {
        print((char)27 + "[31m" + message);
    }
    public static void success(String message)
    {
        print((char)27 + "[32m" + message);
    }
    public static void info(String message)
    {
        print((char)27 + "[37m" + message);
    }
    public static void print(String message)
    {
        out.println(message);
    }


}
