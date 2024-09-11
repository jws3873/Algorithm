# 배수 삭제
n,k = map(int,input().split())
sum = 0
li = list(map(int,input().split()))
for i in li:
    if i%k != 0:
        sum +=i
print(sum)