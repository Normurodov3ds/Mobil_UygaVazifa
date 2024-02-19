package LetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_II {
    public static void main(String[] args) {

        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {

            int n = list0.size();
            for (int j = 0; j < n - 1; j++) {
                int a = 0;
                int b = 0;
                if (n - 1 >= j) {
                    a = list0.get(j);
                    if (j + 1 <= n - 1) {
                        b = list0.get(j + 1);
                    }
                }
                list.add(b + a);
            }
            if (i == 0) {
                list.add(1);
            } else {
                list.addFirst(1);
                list.addLast(1);
            }

            list0 = new ArrayList<>(list);
            list.clear();
        }

        return list0;
    }
}
