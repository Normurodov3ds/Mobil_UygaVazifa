package exprement.B.Collection;

/** Stsck classi Vector classidan voris olgan bolib undagi barcha metodlarni realizatsiya qilgan
 * va o'zi taqdim etgan metodlar ham bor!
 *  stack aynan LIFO tartibida ishlaydoi
 *  stack konstruktor bitta defoult constructor!
 *  stack malumotlarni arrayda saqlaydi.!
 *  stackda senhironayzid va senxronayzid bo'lmagan metodlar bor!
 *  o'zi taqdim etganlari sinxron emas.
 *
 */
public class Stack {
    public static void main(String[] args) {
        /**
         * stack metodlari!
         */

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());// ro'yxatdan elenet oladi va ochiradi!

        System.out.println(stack);

        System.out.println(stack.peek());// ro'yxatdan elementni oladi o'chirmaydi

        System.out.println(stack);

        System.out.println(stack.isEmpty());// bo'sh bulsa tru

        System.out.println(stack.search(1));// element qidiradi!


    }
}
