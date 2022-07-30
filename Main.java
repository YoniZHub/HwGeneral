import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {0.9, -6.5555, 3.24, 10.11, 20.35};

        /*
        //Seifim 1.1-1.3
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length/2]);
         */



        /*
        //Seif 1.4
        for (int i = 0; i < numbers.length - 1; i++){
            System.out.print(numbers[i] + " , " );
        }
        System.out.print(numbers[numbers.length - 1]);
         */



        /*
        //Seif 1.5
        for (int i = (numbers.length-1); i > 0; i--){
            System.out.print(numbers[i] + " , " );
        }

        System.out.print(numbers[0]);
        }
         */


        /*
        //Seif 1.6
        Scanner s = new Scanner(System.in);
        System.out.println("please enter one number");
        double userNum = s.nextDouble();

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > userNum){
                System.out.println(numbers[i]);
            }
        }
         */


        /*
        //Seif 2
        int[] a = {4, 10, 20, 40, 1000};
        int[] b = {0, 0, 0, 0, 0};

        for (int i = 0; i < a.length || i < b.length; i++) {
            b[i]= a[i];
        }

        System.out.println(Arrays.toString(b));
         */

        //Crazy Etgar Palindrome

        Scanner s = new Scanner(System.in);

        System.out.println("please enter array size");
        int arrayLeg = s.nextInt();

        int[] palindromeA = new int[arrayLeg] ;
        if (arrayLeg%2==1){
            System.out.println("not a palindrome");
            return;
        }
        int left = 0;
        int right = 0;
        boolean isPalindrome = true;

        for (int i = 0; i < arrayLeg; i++){
            System.out.println("please enter next number of the array");
            palindromeA[i] = s.nextInt();
        }

        for (int i = 0; i < palindromeA.length / 2; i++) {
            left = palindromeA[i];
            right = palindromeA[palindromeA.length - i - 1];
            if (left == right) {
                isPalindrome = true;
            } else // (left != right)
            {
                isPalindrome = false;

                break;

            }
        }
        for (int j = 0; j < palindromeA.length; j++) {
            System.out.print(palindromeA[j]);
        }
            if (isPalindrome == true){
                System.out.println(" is a palindrome");
            }
            else{
                System.out.println(" is not a palindrome");

            }

    }
}








