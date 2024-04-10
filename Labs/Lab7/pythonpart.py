def findTheCity(self, n, edges, distanceThreshold):
        solution = [[float('inf')] * n for _ in range(n)]
        for i in range(n):
            solution[i][i] = 0
        for u, v, w in edges:
            solution[u][v] = w
            solution[v][u] = w
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if solution[i][k] == float('inf') or solution[k][j] == float('inf'):
                        continue
                    solution[i][j] = min(solution[i][j], solution[i][k] + solution[k][j])
        min_cities = n
        city = -1
        for i in range(n):
            reachable_cities = 0
            for j in range(n):
                if solution[i][j] <= distanceThreshold:
                    reachable_cities += 1
            if reachable_cities <= min_cities:
                if reachable_cities < min_cities or i > city:
                    min_cities = reachable_cities
                    city = i
        return city
