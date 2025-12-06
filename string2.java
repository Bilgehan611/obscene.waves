import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] sayı = {5, 3, 7, 3, 5, 1, 9, 1};


        Set<Integer> set = new TreeSet<>();
        for (int n : sayı) {
            set.add(n);
        }

        System.out.println(set); // [1, 3, 5, 7, 9]
    }
}
