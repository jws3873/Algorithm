# 가장 큰 사각형
x1,x2,y1,y2 = map(int,input().split())
distance1 = abs(x1 - x2) + abs(y1 - y2)
distance2 = abs(x1 - y1) + abs(x2 - y2)
distance3 = abs(x2 - y2) + abs(x1 - y1)
distance4 = abs(x2 - y2) + abs(x1 - y1)
print(max(distance1,distance2,distance3,distance4))