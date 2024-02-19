package Lesson28.Driver;

abstract class DriverFather implements Abstract {
   private String name;
   private String tape;

    public DriverFather(String name, String tape) {
        this.name = name;
        this.tape = tape;
    }

    @Override
    public void work() {

    }

    public String getName() {
        return name;
    }

    public String getTape() {
        return tape;
    }

    abstract void type();
}
