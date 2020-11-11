package Practice_11_11_2020;

import java.util.Arrays;

public class Array_LoopsPractice {
    public static void main(String[] args) {

        int [] scores = new int [5];

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;

        Arrays.sort(scores);
        System.out.println(scores[1]); // 20
        System.out.println(Arrays.toString(scores)); // [10, 20, 30, 40, 50] "softed"

        for (int i = 0; i <= scores.length-1; i++) {
            System.out.println(scores[i]);
        }

    }
}
