public class javapart{
       private int[] x;
public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
       int[][] cost = Arrays.copyOf(pipes, pipes.length + n);
        for (int i = 0; i < n; i++) {
            cost[pipes.length + i] = new int[] {0, i + 1, wells[i]};
        }
        Arrays.sort(cost, (a, b) -> a[2] - b[2]);
        x = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            x[i] = i;
        }
        int solution = 0;
        for (int i = 0; i < nums.length; i++) {
        int[] y = nums[i];
        int a = y[0], b = y[1], c = y[2];
        int xa = find(a), xb = find(b);
        if (xa != xb) {
            p[xa] = xb;
            solution += c;
            if (--n == 0) {
                return solution;
            }
          }
        }
        return solution;
    }
    public int find(int z) {
        if (p[z] != z) {
            p[z] = find(p[z]);
        }
        return p[z];
    }
    }
}
