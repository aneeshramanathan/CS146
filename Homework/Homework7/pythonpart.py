import heapq
from typing import Self


def minMeetingRooms(self, intervals: list[list[int]]) -> int:   
    intervals.sort(key=lambda x: x[0])
    serverEndTimes=[]
    for start, end in intervals:
        while serverEndTimes and serverEndTimes[0] <= start:
            heapq.heappop(serverEndTimes)
        heapq.heappush(serverEndTimes, end)
    return len(serverEndTimes)

intervals = [[0,30],[5,10],[15,20]]
print(minMeetingRooms(Self, intervals))
intervalsTwo = [[0,1],[1,2],[2,3]]
print(minMeetingRooms(Self, intervalsTwo))

