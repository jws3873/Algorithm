# 경로의 개수
n = int(input())
li = list(map(int,input().split()))
case=1
for i in li:
    case *=i
print(case)