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

        //Creamos un arreglo para tener los caracteres
        char[] arreglo = s.toCharArray();
        int total = 0;
        for(char caracter: arreglo) {
            total += map.get(caracter);
        }

        return total;
    }


    public static void main (String []args) {

        System.out.println("Total: " + romanToInt("IV"));
    }
}
