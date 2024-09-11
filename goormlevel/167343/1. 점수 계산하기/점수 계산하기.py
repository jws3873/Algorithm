# 점수 계산하기
n = int(input())
str = input()
score = 0
c_tmp = ''
continuScore = 1
for c in str:
    if c == 'O':
        if c_tmp == 'O':
            continuScore +=1
            score += continuScore
        else:
            score += 1
    else:
        continuScore = 1
    c_tmp = c
print(score)