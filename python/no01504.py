from collections import deque
import sys

def dijkstra(arr, start, end):
  visited = [False] * len(arr)
  visited[start-1] = True
  dist = [sys.maxsize] * len(arr)
  dist[start-1] = 0
  queue = deque([start])

  while True:
    pos = queue.popleft()    
    for i in range(len(arr)):
      if not arr[pos][i]: continue
      dist[i] = max(dist[i], dist[pos] + arr[pos][i])
      if not visited[i]:
        queue.append(i)
        visited[i] = True
    
    if pos == end or not len(queue): break

    return dist(end)

def main():
  miis = lambda: map(int, sys.stdin.readline().split())
  n, e = miis()
  arr = [[0] * n for _ in range(n)]
  for _ in range(e):
    dist, start, end = miis()
    arr[start][end] = dist
  v1, v2 = miis()

  a1 = dijkstra(arr, start, v1)
  a2 = dijkstra(arr, start, v2)
  b1 = dijkstra(arr, v1, end)
  b2 = dijkstra(arr, v2, end)

  ans = min(a1 + b2, a2 + b1)
  print(ans)

if __name__ == '__main__':
  main()