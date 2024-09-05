n = int(input())
sum = 0
for i in range(n):
    c,v = input().split()
    v = int(v)
    if sum >= 0 :
        sum = sum + v if c == 'in' else sum - v
    else:
        break
print('success' if sum >= 0 else 'fail')