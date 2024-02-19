package exprement.B.Collection;

import exprement.B.Depandensing.Airplane;
import exprement.B.Depandensing.Pilot;
import exprement.B.Depandensing.Vertalyot;
import exprement.B.Person;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Collection;
import java.util.List;

public class ArrayList {
    /**
     * Mulohaza: ArrayList bu class bo'lib u List interfasedan voris olgann List esa Collection dan voris olgan
     * demak List va Collection metodlarini realizatsiya qilgan o'zida!
     * ArrayList  aosida Array yotibdi. Yaniy ArrayList classi malumotlarni saqlash uchun Array dan foydalanadi
     * ArrayList ko'rinishidagi <E> belgilar bu ArrayList ni generic ekanligini anglatadi
     * <p>
     * Oltin qoidalar:
     * <p>
     * Based on Resizable or Growable array - uzunligi kattakalashadigan array asosida qurilgan. Ya'ni ArrayList elementlarni arrayda saqlaydi.
     * Duplicates are allowed - Dublikatlar (o'xshash) elementlar qo'shish mumkin
     * Insertion order is preserved - Ro'yhatga qo'shish tartibi saqlanib qoladi. Ya'ni 1chi qo'shilgan ob'ekt har doim ro'yhatda 1chi bo'ladi. Agar uni o'zimiz o'zgartirmasak albatta.
     * Null insertion is possible - Ro'yhatga Null qiymat qo'shish mumkin.
     * Not Thread Save - Oqimlar (Thread lar) uchun havsiz emas. Ya'ni bir nechta oqim ishlatsa ro'yhat bittasida o'zgarib , boshqa bittasida o'zgarmaydi.
     * Best (frequent operation) - retrieval operation - Ishlatish tavsiya etiladi agar tez-tez qilinadigan operatsiya (amal) list (ro'yhat) dan malumotni olish bo'lsa.
     * Ya'ni malumotni ro'yhatdan olish amali juda tez bajariladi va shu holatda ArrayList ni ishlatish tavsiya qilinadi.
     * Wort (frequent operation) - insertion and deletion (in the middle) - Ishlatish tavsiya etilmaydi agar ko'p ishlatiladigan amallar ro'yhatga qo'shish yoki ro'yhat o'rtasidan o'chirish bo'lsa.
     * Sababi element qo'shganda ArrayList ichidagi array to'lsa u yangi array yaratib malumotlarni ko'chirib o'tqazishi kerak
     * Agar o'rtasidan element o'chirilsa undan keyingi elementlarni bitta oldinga surib chiqishi kerak.
     */

    public static void main(String[] args) {

        /** ArrayList methods -> metodlari yo'q!
         * ArrayList dagi barcha metodlar List va Collection dan kelgan metodlar.
         * ArrayList ning o'zi yangi metod tagdim etmaydi.
         * ArrayList -> construktorlari! soni 3 ta
         * 1) ArrayList<>() - > bo'sh constructor bush array yaratadi!
         * 2) ArrayList<>(15) - > hajmi 15 ga teng array hozil qiladi!
         * 3) ArrayList<>(collection) - > bu ichida list bor bolgan array hosilqiladi!
         * capasity oshisi -> capasitiy = (capasitiy*3/2)+1; ko'rinishda oshadi!
         * Eslatma. Generic larni primitive tiplar uchun ishlatib bo'lmaydi.
         * Demak Collectionlarni barchasini primitive tiplar uchun ishlatib bo'lmaydi.
         * Array listni ham primitive tiplar uchun ishlatib bo'lmaydi.
         * Java ArrayList klassi sinxronlashtirilmagan .
         */

        // masala: otgan mavzularni takrorlagan holada arrayni sort qilish!

        java.util.ArrayList<Person> list = new java.util.ArrayList<>();

        Pilot vertalyot = new Vertalyot();
        Pilot airplane = new Airplane();

        list.add(new Person("Komil", 22, vertalyot));
        list.add(new Person("Sag'zod", 23, airplane));
        list.add(new Person("Aziz", 20, airplane));
        list.add(new Person("Malik", 21, airplane));
        list.add(new Person("Zafar",25 , vertalyot));
        list.add(new Person("Bobur", 19, vertalyot));
        list.add(new Person("Dilshot", 18, airplane));
        list.add(new Person("Nodir", 26, vertalyot));
        list.add(new Person("Jamol", 27, airplane));

        Collections.sort(list);
        System.out.println(list);

        list.get(0).fly();
    }
}





























