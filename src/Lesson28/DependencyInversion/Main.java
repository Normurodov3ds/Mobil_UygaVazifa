package Lesson28.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        User user = new User(logger);
        user.showLogger();

        Logger logger2 = new FileLogger();
        User user2 = new User(logger2);
        user2.showLogger();
    }
}
