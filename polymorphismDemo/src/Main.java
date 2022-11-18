
public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("selam");

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("hey yoo!!");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};
        for(BaseLogger baseLogger:loggers){
            baseLogger.log("Log message");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}