import math

# 의좋은 형제
a,b = map(int,input().split())
d = int(input())
bool = True

for i in range(d):
    if bool == True:
        b = b + math.ceil(a/2)
        a = math.floor(a/2)
        bool = False
    else:
        a = a + math.ceil(b/2)
        b = math.floor(b/2)
        bool = True

print('%d %d'%(a,b))
