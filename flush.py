deck=["2s","2w","2a","2k","3s","3w","3a","3k","4s","4w","4a","4k","5s","5w","5a","5k",
  "6s","6w","6a","6k","7s","7w","7a","7k","8s","8w","8a","8k","9s","9w","9a","9k",
  "10s","10w","10a","10k","Js","Jw","Ja","Jk","Qs","Qw","Qa","Qk","Ks","Kw","Ka","Kk",
   "As","Aw","Aa","Ak"
  ]
increment=0


masukin=[]
for i in range(20):
    for j in range(i,i+40,8):
        masukin.append(deck[j])
        increment+=1

    print(masukin)
    masukin.clear()
print("kombinasi", increment)
