// G:\My Drive\LEARNING\FUNiX\6_CSD201x_02-A_VN-Algorithm\Exercises

import java.util.Scanner;

public class Main {

    // Hàm nhập ma trận a từ bàn phím
    static void input(int[][] b, int n) {
        Scanner input = new Scanner(System.in);
        b = new int[n][n];

        System.out.println("Nhap vao mang b");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                b[i][j] = input.nextInt();
    }

    public static void main(String[] args) {
        Graph g = new Graph();
//        int n = 6;
//        int[][] b = new int[n][n];
//        input(b, n);

        int n = 5;

        int [][] b = {
            {0,1,1,0,1},
            {1,0,1,0,0},
            {1,1,0,1,0},
            {0,0,1,0,0},
            {1,0,0,0,0},
        };

        g.setData(b);
        g.disAdj();

        System.out.println();
        System.out.println();

        g.breadth(1);

        System.out.println("Is G is connected? " + g.isConnected());

        System.out.println("Degree of the vertex A in the G is " + g.degree(0));

        System.out.println();
    }
}