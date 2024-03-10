import sys
d= {}
n = int(sys.stdin.readline())

for i in range(n):
    s, c = sys.stdin.readline().split()
    if(s in d):
        d[s] = d[s]+int(c)
    else:
        d[s] = int(c)

check = False
for c in d.values():
    if(c == 5):
        check = True

print('YES' if check else 'NO')