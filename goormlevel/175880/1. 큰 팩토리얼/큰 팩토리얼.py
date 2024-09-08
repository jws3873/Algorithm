# 큰 팩토리얼
n = int(input())
f = 1
for i in range(1,n+1):
    f = f * i
print(f%1000000007)