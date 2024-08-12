# 정사각형의 개수
# 제곱의 합을 이용하여 계산을 진행(n이 1일때는 1개, 2일때는 5개(4+1), 3일때는 14개(9+4+1))
n = int(input())
result = 0
for i in range(1,n+1):
    result += i**2
print(result)