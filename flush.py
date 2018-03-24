deck=["2","3","4","5","6","7","8","9","10","J","Q","K","As"],["L","S","W","K"]

increment=0


for i in range(13):
    for j in range(0,10,2):
        print(deck[0][j],end='')
        print(deck[1][i],end=' ')
        increment+=1

    print()
print("kombinasi", increment)

for i in range(13):
    for j in range(0, 10, 2):
        print(deck[0][j], end='')
        print(deck[1][i], end=' ')
        increment += 1

    print()
print("kombinasi", increment)

# for i in range (52):
#     for j in range(i,i+21,1):
#         masukin.append(deck[j])
#         if(masukin[i][0]- deck[j][0]==abs(1)):
#             masukin.append(deck[j])
#         print (masukin)
#
#     increment +=1
#     masukin.clear()