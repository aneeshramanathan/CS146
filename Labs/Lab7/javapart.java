public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int solution[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                solution[i][j] = (int) (1e9);
            }
        }
        for (int i = 0; i < edges.length; i++) {
            int in = edges[i][0];
            int out = edges[i][1];
            int weight = edges[i][2];
            solution[in][out] = weight;
            solution[out][in] = weight;
        }
        for (int i = 0; i < n; i++) {
            solution[i][i] = 0;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (solution[i][k] == (int) (1e9) || solution[k][j] == (int) (1e9)) {
                        continue;
                    }
                    solution[i][j] = Math.min(solution[i][j], solution[i][k] + solution[k][j]);
                }
            }
        }
        int minsCities = n;
        int city = -1;
        for (int i = 0; i < n; i++) {
            int reachableCities = 0;
            for (int j = 0; j < n; j++) {
                if (solution[i][j] <= distanceThreshold) {
                    reachableCities++;
                }
            }
            if (reachableCities <= minsCities) {
                if (reachableCities < minsCities || i > city) {
                    minsCities = reachableCities;
                    city = i;
                }
            }
        }
        return city;
    }
