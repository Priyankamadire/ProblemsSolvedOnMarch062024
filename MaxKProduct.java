
/*
 * Cob is working an Group of numbers.
 * His teacher gave him to print the Maximum product of the 'k' consiqutive
 * numbers.
 * 
 * The first line of input contains the group size followed by group numbers
 * followed by k
 * 
 * input = 5
 * 1 5 3 2 10
 * 3
 * output = 60
 * 
 * input = 7
 * 8 7 1 8 2 9 1
 * 2
 * output = 56
 */
import java.util.*;

public class MaxKProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(solve(n, arr, k));
    }

    public static int solve(int n, int arr[], int k) {

        int MaxiProd = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int prod = 1;
            for (int j = i; j < i + k; j++) {
                prod = prod * arr[j];
            }
            MaxiProd = Math.max(prod, MaxiProd);
        }
        return MaxiProd;
    }
}