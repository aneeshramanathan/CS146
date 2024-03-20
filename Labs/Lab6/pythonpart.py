def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        list = [[] for _ in range(numCourses)]
        indegree = [0] * numCourses
        for prerequisite in prerequisites:
            list[prerequisite[1]].append(prerequisite[0])
            indegree[prerequisite[0]] += 1
        queue = []
        for i in range(numCourses):
            if indegree[i] == 0:
                queue.append(i)
        count = 0
        while queue:
            course = queue.pop(0)
            count += 1
            for neighbor in list[course]:
                indegree[neighbor] -= 1
                if indegree[neighbor] == 0:
                    queue.append(neighbor)
        return count == numCourses
