// Find the maximum & minimum number in an array of integers.

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int integers [] = new int [a];

        for(int i=0; i<a; i++){
            integers[i] = sc.nextInt();

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<integers.length; i++){
                if (integers[i] < min) {
                    min = integers[i];
                    
                }

                if (integers[i] > max) {
                    max = integers[i];
                   
                }
        }

        System.out.println("largest number is" + max);
        System.out.println("smallest number is" + min);
        sc.close();
    }
}
