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
        System.out.println("The adjacency matrix: ");
        for(int i = 0; i < n; i++) {
            System.out.println();
            for(int j = 0; j < n; j++)
                System.out.printf("%5d", a[i][j]);
        }
    }

    void visit(int i) {
        System.out.print(i + " ");
    }

    // Hàm duyệt theo BFS bắt đầu tại đỉnh k bằng cách sử dụng MyQueue, mỗi khi lấy 1 đỉnh ra khỏi  queue thì hiển thị luôn (duyệt) đỉnh đó ra màn hình
    void breadth(int k) {
        MyQueue q = new MyQueue();
        boolean[] explored = new boolean[n];

        explored[k] = true;
        q.enqueue(k);

        while (!q.isEmpty()) {
            int current = q.dequeue();
            for(int i = 0; i < n; i++)
                if(!explored[i] && a[current][i] == 1) {
                    visit(i);
                    explored[i] = true;
                    q.enqueue(i);
                }
        }
        System.out.println();
    }

    // Hàm kiểm tra tính liên thông của đồ thị
    boolean isConnected() {
        MyQueue q = new MyQueue();
        boolean[] explored = new boolean[n];
        int count = 1;

        explored[0] = true;
        q.enqueue(0);

        while (!q.isEmpty()) {
            int current = q.dequeue();
            for(int i = 0; i < n; i++)
                if(!explored[i] && a[current][i] == 1) {
                    count++;
                    explored[i] = true;
                    q.enqueue(i);
                }
        }
        return (n == count);
    }

    // Hàm tính bậc của đỉnh k
    int degree(int k) {
        int degree = 0;
        for(int i : a[k])
            degree += i;
        return degree;
    }
}
