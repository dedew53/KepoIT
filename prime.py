# def prime(x):
#     prim = True
#     if x >= 2:
#         for i in range(2,x) :
#             if x % i == 0 :
#                 prim = False
#     else :
#             prim = False
#     return prim
#
# for i range (1,10):
#     if prim(i):
#         print i

def prime(bilangan):
    count = 0
    for i in range (1,bilangan+1):
        if(bilangan % i == 0):
            count +=1
        if(count==2):
            return "prime"
        else:
            return"not prime"
tes= prime(10)
print (tes)