import sys
n = int(sys.stdin.readline())
l = []

for i in range(n):
    a = int(sys.stdin.readline())
    l.append(a)

last = l[-1]
count = 1

for i in reversed(range(n)):
    if(l[i] > last):
        last = l[i]
        count+=1

print(count)
