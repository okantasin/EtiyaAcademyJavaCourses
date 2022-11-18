public class DatabaseLogger extends BaseLogger{
    @Override
    public void log(String message) {
        super.log("logged database:"+message);
    }
}
