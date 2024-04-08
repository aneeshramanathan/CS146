class pythonpart:
    def __init__(self):
        self.x = []
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        cost = pipes.copy()
        for i in range(n):
            cost.append([0, i + 1, wells[i]])
        cost.sort(key=lambda x: x[2])
        self.x = [i for i in range(n + 1)]
        solution = 0
        def find(z: int) -> int:
            if self.x[z] != z:
                self.x[z] = find(self.x[z])
            return self.x[z]
        for a, b, c in cost:
            xa, xb = find(a), find(b)
            if xa != xb:
                self.x[xa] = xb
                solution += c
                n -= 1
                if n == 0:
                    return solution
        return solution


