# 입력받아 출력하기
n = int(input())
a, b = input().split()

for i in range(1,n+1):
    for j in range(1,n+1):
        print(a if (i*j)%2 != 0 else b, end= ' ')
    print()