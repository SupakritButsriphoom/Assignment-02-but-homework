/*
 * จงเขียนโปรแกรมสำหรับการทำ Matrix Transpose โดยให้รับค่า Matrix ขนาด 3x3 ด้วยตัวแปร Array 2 มิติ จากนั้น ให้แสดงผลลัพธ์ของ Matrix ที่รับค่าจากตัวแปรก่อน แล้วจึงแสดงผลลัพธ์ Matrix Transpose

 */
package matrixtranspose6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print("Enter matrix index of [" + i + "][" + a + "]: ");
                arr[i][a] = sc.nextInt();
            }
        }
        System.out.println("Normal Matrix is");
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(arr[i][a] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                transpose[i][a] = arr[a][i];
            }
        }
        System.out.println("Matrix Transpose is");
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(transpose[i][a] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public Object getGreeting() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGreeting'");
    }
}