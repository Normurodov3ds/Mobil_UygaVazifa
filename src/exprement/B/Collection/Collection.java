package exprement.B.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(7);



// 1)

//        System.out.println(list.add(4)); // add true false qaytaradi!
//        System.out.println(list);

//2)

//        System.out.println(list.addAll(list1)); // addall true false qaytaradi!
//        System.out.println(list);

//3)

//        System.out.println(list.remove(1));// index dagi obyectbi ochiradi! o'sha obyectni qaytaradi ochirilsa!
//        System.out.println(list);

//4)

//        System.out.println(list.removeAll(list1));// lisdan collectionni o'chiradi borlarini! boolean returinqiladi!
//        System.out.println(list);

//5)

//        System.out.println(list);
//
//        System.out.println(list.removeIf(integer -> integer%2==1)); // bu metod berilgan shartga ko'ra o'chiradi!
//        System.out.println(list);                                              // bittasini o'chirsa ham truqaytaradi!

//6)

//        System.out.println(list.retainAll(list1));//  boolean qaytaradi o'chirsa. list da list1ni bor bulgan elementlariga tegmaydi!
//        System.out.println(list);

//7)

//        System.out.println(list.size());// o'lchami

//8)

//        list1.clear(); // listni o'chiraqi!
//        System.out.println(list);
//        System.out.println(list1);

//9)

//        System.out.println(list.contains(5)); // bewilgan element to'plamda bor yuqligini tekshiradi!

//10)

//    System.out.println(list.containsAll(list1));// listdagi barcha elementlar bor bulsa true bittasi yuq bulsa ham false!

//11)
// Iterator<Integer> iterator = list.iterator();// iterator ga o'giradi!
//
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//12)

//        Object[] array = list.toArray();// rarrayga o'giradi aynan obj[] ga
//        System.out.println(Arrays.toString(array));

// 13)
//        list.toArray(new Integer[]{});
//
//        Integer[] array = list.toArray(new Integer[0]);
//        System.out.println(Arrays.toString(array)); // arrayga o'giradi aynan qaysi tipga tegishli bulasa
//        String[] array1 = list.toArray(new String[1]);

//14)     System.out.println(list.isEmpty());// list bo'shliqqa tecshiradi!

// jami 19 ta metod bor qolgani strea va equals va hashkode metodlari bu collection taqdim etgam metodlar edi!









    }
}
