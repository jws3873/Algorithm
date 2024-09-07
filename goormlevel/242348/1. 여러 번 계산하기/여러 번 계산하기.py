# 여러 번 계산하기
n = int(input())
li = []
for i in range(n):
    a,b = map(int,input().split())
    li.append(a+b)
for i in li:
    print(i)