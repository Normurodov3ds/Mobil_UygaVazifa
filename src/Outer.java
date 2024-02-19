public class Outer {
    public int a = 12;


    private class inner {
        int b = 13;
        void d(){
            System.out.println(111);
        }
    }

    void aa(){


      inner inner = new inner();
      inner.d();



    }
}
