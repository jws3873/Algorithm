# 정수 변환기
n, k = map(int,input().split())
str = input()
k = int(k)
for s in str:
    print(int(s) + k,end='')