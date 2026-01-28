public class Logger {
    private static Logger instance;

    private Logger(){};

    public static Logger getInstance()
    {
        synchronized (Logger.class) {
            if (instance == null)
                return new Logger();
        }
        return instance;
    }

    public void log()
    {
        System.out.println("Log");
    }
}
