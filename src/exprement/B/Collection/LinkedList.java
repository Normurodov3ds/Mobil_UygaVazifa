package exprement.B.Collection;

public class LinkedList {
    /**LinkidList bu class list interfasedan voris olgan yani list va collection dan kelgan metodlarni o'zida
     * realizarsiya qilgan!
     * linkidlistda 2 ta constructor bor:
     * 1) bo'sh constructor
     * 2) collection berib yuborsak bo'ladi yani berilgan colection bilan linkidlist hosilqiladi!.
     *
     * javada linkid list duble linkdan foydalanadi yani ikki tomonlama bog'lanish!
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list  = new java.util.LinkedList<>();
        list.addFirst(1);
        list.add(2);
        list.addLast(3);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        /**
         * LinkedListning 6 ta funcsiya o'ri qo'shgan
         *
         */

    }
}
