public interface Account {
    public abstract void openAccount();
    public void closeAccount();
    public void deposit();
    public void withdraw();
    public void interest();
    public default void info(){
        System.out.println("hello");
    }
    public static void disp(){
        System.out.println("welcome");
    }
}
