package T08;

import java.util.Scanner;

public class threeDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[3][3][5];
        System.err.println("Enter the element of array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.err.print(a[i][j][k] + " ");
                }
                System.err.println();
            }
            System.out.println();
        }
    }
}
