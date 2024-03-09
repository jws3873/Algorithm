import sys

n = int(sys.stdin.readline())
s = []
l = list(map(int,sys.stdin.readline().split()))

for i in range(n):
    if(l[i] == 0):
        s.append(i+1)
    elif(l[i] == 1):
        s.insert(i-1,i+1)
    else:
        s.insert(i-l[i],i+1)

for i in s:
    print(i,end=' ')