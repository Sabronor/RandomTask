package Shuffle;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] x = {1, 1, 1, 1, 2, 2, 2, 2};

        System.out.println(Arrays.toString(x));

        System.out.println(Arrays.toString(solution.shuffle(x, 4)));
    }
}
