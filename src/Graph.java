public class Graph {
    int[][] a; int n;

    Graph() {
        a = null;
        n = 0;
    }

    void clear() {
        a = null;
        n = 0;
    }

    void setData(int[][] b) {
        n = b.length;
        a = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = b[i][j];
    }

    void disAdj() {
        for(int i = 0; i < n; i++) {
            System.out.println("The adjacency matrix: ");
            System.out.println();
            for(int j = 0; j < n; j++)
                System.out.printf("%5d", a[i][j]);
        }
    }

    void visit(int i) {
        System.out.println(i + " ");
    }

    // Hàm duyệt theo BFS bắt đầu tại đỉnh k bằng cách sử dụng MyQueue, mỗi khi lấy 1 đỉnh ra khỏi  queue thì hiển thị luôn (duyệt) đỉnh đó ra màn hình
    void breadth(int k) {
        MyQueue q = new MyQueue();


    }

    // Hàm kiểm tra tính liên thông của đồ thị
    boolean isConnected() {

        return true;
    }

    // Hàm tính bậc của đỉnh k
    int degree(int k) {

        return 0;
    }
}
