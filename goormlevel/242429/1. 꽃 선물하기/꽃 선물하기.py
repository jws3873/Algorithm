# 꽃 선물하기
n = int(input())
li = []

for i in range(n):
    a,b = map(int,input().split())
    if a < b:
        li.append('Sunflower')
    elif a == b :
        li.append('Tulip')
    else :
        li.append('Rose')

for s in li:
    print(s)


