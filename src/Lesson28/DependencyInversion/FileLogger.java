package Lesson28.DependencyInversion;

public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("File Logger...");
    }
}
