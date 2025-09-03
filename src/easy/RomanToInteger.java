package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt (String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        char[] arreglo = s.toCharArray();
        int total = 0;

        for (int i = 0; i < arreglo.length; i++) {

            if (i + 1 < arreglo.length && map.get(arreglo[i]) < map.get(arreglo[i + 1])) {
                total += map.get(arreglo[i + 1]) - map.get(arreglo[i]);
                i++;

            } else {
                total += map.get(arreglo[i]);

            }
        }

        return total;
    }


    public static void main (String []args) {

        System.out.println("Total: " + romanToInt("XLIV"));
    }
}
