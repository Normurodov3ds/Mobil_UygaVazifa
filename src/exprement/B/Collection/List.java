package exprement.B.Collection;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    /**
     *  List interfasi Collection interfasedan olgan metodlar va o'zi taqdim etgan metodlar mavjud!
     *  biz bilamizki collection da 13-14 ta metod bor defoult
     */
    /**
     *  Collection collection = new Collection() {
     *         @Override
     *         public int size() {
     *             return 0;
     *         }
     *
     *         @Override
     *         public boolean isEmpty() {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean contains(Object o) {
     *             return false;
     *         }
     *
     *         @Override
     *         public Iterator iterator() {
     *             return null;
     *         }
     *
     *         @Override
     *         public Object[] toArray() {
     *             return new Object[0];
     *         }
     *
     *         @Override
     *         public Object[] toArray(Object[] a) {
     *             return new Object[0];
     *         }
     *
     *         @Override
     *         public boolean add(Object o) {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean remove(Object o) {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean containsAll(Collection c) {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean addAll(Collection c) {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean removeAll(Collection c) {
     *             return false;
     *         }
     *
     *         @Override
     *         public boolean retainAll(Collection c) {
     *             return false;
     *         }
     *
     *         @Override
     *         public void clear() {
     *
     *         }
     *     };
     */

    // List interfasening o'zi taqdim etgan metodlari!

    public static void main(String[] args) {

        java.util.List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        java.util.List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

//1)

//      list.add(1,5);
//      System.out.println(list); // add(index,element) -> bu collectiondan kelgan metod emas bu o'zinig metodi
                                    // etibor bering bu void hechnarssaqaytarmaydi!
//2)
//        System.out.println(list.addAll(1,list1)); // bu ham collsectonki emas berilgan index dan boshlab qo'sadi!
//3)
//        System.out.println(list.remove(1));// o'zinig metodi
//        System.out.println(list.remove(list.get(0)));// collection metodi!
//        System.out.println(list);


//4)
//        System.out.println(list.get(1));// listdan berilgan index ni return qiladi!

// 5)
//        System.out.println(list.set(1, 5));//  berilgan inddexga set qiladi elementni va ochadiganini qaytaradi!
//        System.out.println(list);

// 6)
//        System.out.println(list.indexOf(5));// berilgan element ni turgan o'rnini qaytaradi! bo'lmasa -1 qaytadi!

//7)
//        System.out.println(list.lastIndexOf(3));// berilgan elementni oxirgi uchraganini qaytaradi indexini!

//8)
//        list.addAll(list1);
//
//        java.util.List<Integer> list2 = list.subList(2,5); //  berilgan from index dan index gacha bo'lgan elementlarni qaytaradi list ko'rinishiuda!.
//        System.out.println(list2);

        /**
         * List bu interface u metodlarni realizatsiya qilmagan.
         * List interface dan implements olgan classlar bu metodlarni realizatsiya qilgan.
         * Xulosa biz List interfasei Collectiondan voris olgan shunig uchun o'zi taqdim etgan va voris olgan metodlar
         * bor! adashmang add(index,element) -> bu listning metodi collectionda yoq!, remove(index) ham shunaqa
         */


    }
}
