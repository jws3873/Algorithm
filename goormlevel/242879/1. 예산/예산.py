# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
# 예산
N,M = map(int,input().split())

for i in range(N):
    c,v = map(int,input().split())
    M = M - (c*v)

if M >= 0 :
    print(M)
else : 
    print('No')