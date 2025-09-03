package easy;

import java.util.HashMap;

public class TwoSum {


    public static int[] twoSum (int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            int valorBuscar = target - nums[i];

            if (map.containsKey(valorBuscar)) {

                return new int[]{map.get(valorBuscar), i};

            } else {

                map.put(nums[i], i);

            }
        }

        return new int[]{};
    }


    public static void main (String[] args) {
        long start = System.currentTimeMillis();

        int [] arreglo = {2, 7, 11, 15};
        int[] result = twoSum(arreglo, 9);


        System.out.println("Indice " + result[0] + " valor: " + arreglo[result[0]]);
        System.out.println("Indice " + result[1] + " valor: " + arreglo[result[1]]);
        long end = System.currentTimeMillis();

        System.out.println("Tiempo: " + (end - start) + " ms");

    }
}
