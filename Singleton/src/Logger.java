public class Logger {
    private static volatile Logger instance;

    private Logger(){};

    public static Logger getInstance()
    {
        if(instance == null) {
        synchronized (Logger.class) {
            if (instance == null)
                return new Logger();
            }
        }
        return instance;
    }

    public void log()
    {
        System.out.println("Log");
    }
}
