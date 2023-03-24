// G:\My Drive\LEARNING\FUNiX\6_CSD201x_02-A_VN-Algorithm\Exercises

public class Main {

    // Hàm nhập ma trận a từ bàn phím
    static void input(int[][] b, int n) {

    }

    public static void main(String[] args) {
        Graph g = new Graph();
        int n = 6;
        int[][] b = new int[n][n];
        input(b, n);

        g.setData(b);
        g.disAdj();

        g.breadth(1);

        System.out.println("Is G is connected? " + g.isConnected());

        System.out.println("Degree of the vertex A in the G is " + g.degree(0));

        System.out.println();
    }
}