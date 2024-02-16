package S.O.L.I.D;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[][] b = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(b)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] a) {
        int n = a.length;
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                boolean b = false;
                for (int k = 0; k < n; k++) {
                    for (int l = j+1; l < n; l++)
                        if (a[i][j] == a[k][l]) {
                            b = true;
                        }
                }
                if (b) {
                    g[i] = a[i][j];
                }
            }
        }

        return g;
    }
}
