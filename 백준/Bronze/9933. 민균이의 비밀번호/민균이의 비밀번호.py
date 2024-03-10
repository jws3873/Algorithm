import sys
l = []
lr = []
n = int(sys.stdin.readline())

for i in range(n):
    s = sys.stdin.readline().rstrip('\n')
    l.append(s)
    ls = list(s)
    ls.reverse()
    lr.append(''.join(ls))

check = False
for i in range(n):
    for s in lr:
        if l[i] == s:
            idx = len(l[i])//2
            print(len(l[i]),l[i][idx])
            check = True
            break
    if(check == True):
        break