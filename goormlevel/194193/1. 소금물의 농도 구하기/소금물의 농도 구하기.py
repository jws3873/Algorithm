# 소금물의 농도 구하기
# 소금의 양 = (소금물의농도/소금물의양)/100
# 농도 = 소금의양/소금물의양*100
# 소금물의양 소금양/농도*100
import math
Ng,Mg = map(int,input().split())
solt = (7*Ng) / 100
print('%.2f'%(math.floor(solt/(Ng+Mg)*100*100)/100))