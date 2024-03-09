import sys

n = int(sys.stdin.readline())
for i in range(n):
    lst = list(sys.stdin.readline().split())
    print("Case #{}: ".format(i+1), end ='')
    for s in reversed(lst):
        print(s,end =' ')
    print()