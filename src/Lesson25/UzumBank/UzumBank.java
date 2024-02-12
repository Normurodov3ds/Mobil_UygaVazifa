package Lesson25.UzumBank;

import Lesson24.MyArrays.AbstractList.ArrayLists.My_ArrayList;
import Lesson25.UzumBank.Entery.Entery;

public class UzumBank {
    private static UzumBank uzumBank = null;
    private My_ArrayList<Entery> list = new My_ArrayList<>();

    private UzumBank() {
    }

    public static UzumBank getUzumBank() {
        if (uzumBank == null) {
            uzumBank = new UzumBank();
        }
        return uzumBank;
    }

    public My_ArrayList<Entery> getList() {
        return list;
    }
}
