import java.util.function.BiConsumer;

public class Main {
    static void d(){

    }
    static int s;
      void a(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        s = 12;
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(45, 15);
    }
}