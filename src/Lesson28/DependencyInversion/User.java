package Lesson28.DependencyInversion;

public class User {
    private  Logger logger;

    public User(Logger logger) {
        this.logger = logger;
    }

    void showLogger(){
        logger.log();
    }
}
