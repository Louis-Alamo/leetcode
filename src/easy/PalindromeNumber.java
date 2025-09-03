package easy;

public class PalindromeNumber {


    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverted = 0;
        while (x > reverted) {

            reverted = (reverted * 10) + (x % 10);
            x = x / 10;

        }

        return reverted == x || reverted / 10 == x;
    }


    public static void main (String args[]) {
        long start = System.currentTimeMillis();

        System.out.println(isPalindrome(122222221));

        long end = System.currentTimeMillis();

        System.out.println("Tiempo: " + (end - start) + " ms");

    }
}
