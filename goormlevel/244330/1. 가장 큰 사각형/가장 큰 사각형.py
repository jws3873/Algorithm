# 가장 큰 사각형
t = int(input())
li = []
for i in range(t):
    w,h = map(int,input().split())
    li.append((w*h))
print(max(li))