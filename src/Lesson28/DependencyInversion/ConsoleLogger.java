package Lesson28.DependencyInversion;

public class ConsoleLogger implements Logger{

    @Override
    public void log() {
        System.out.println("Console Logger...");
    }
}
