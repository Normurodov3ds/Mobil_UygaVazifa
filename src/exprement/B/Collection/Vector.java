package exprement.B.Collection;

public class Vector {
    /** Vector classi bu List interfasedan voris olgan class bo'lib undagi barcha metodlarni realizatsiya qilgan!
     * vector classi serdsaf bolib oqimlar ucchun xafsiz!
     * ArrayListdan farqli tomonlari
     * 1) vector metodlari sredsafdir
     * 2) vector konstruktorlari 4 ta
     *    1. default
     *    2. capasity
     *    3. collection bersak bo'ladi
     *    4. capasity va oshish chegarasini bersak boladi
     * 3) vector classi o'zi taqdim qilgan metodlar mavjud!
     *
     * vector metodlari!
     * 1) void addElement() reoyxatga elaement qo'shadi!
     * 2) boolean removeElement(_) berilgan obj ni ochiradi true false qaytaradi!
     * 3) void removeElementAt(index) berilgan indexdagi elementni o'chiradi!
     * 4) void removeElements() reo'yxatdagi barcha elamentlarni o'chiradi!
     * 5) elemementAt(index) berilgan index dagi elamentni rerurn qiladi!
     * 6) firstElement() reoyxatdagi birinchi elementni return qiladi!
     * 7) lastElement() ro'yxatdagi oxirgi elementni returb qiladi!
     * 8) capasity() ro'yxat uzunligini qaytaradi!
     * capasity oshish formulasi 2x ekan!
     */


    public static void main(String[] args) {
        java.util.Vector<Integer> vector = new java.util.Vector<>(5);
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        vector.addElement(6);

        //System.out.println(vector.removeElement(6));
       // vector.removeElementAt(0);
       // System.out.println(vector.elementAt(2));
//        System.out.println(vector.firstElement());
//        System.out.println(vector.lastElement());
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
