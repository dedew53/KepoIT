#ukuran matrik
N = 8
#cetak langkah jalurnya
def printSolusi(sol):
    for i in sol:
        for j in i:
            print(str(j) + " ", end="")
        print("")

#fungsi untuk cek jika x,y valid
#index for N*N maze
def aman(maze, x, y):
    if x >= 0 and x < N and y >= 0 and y < N and maze[x][y] == 1:
        return True

    return False



def pecahkan(maze):
    #matrix 8x8
    sol = [[0 for j in range(8)] for i in range(8)]

    if sebelumdipecahkan(maze, 0, 1, sol) == False:
        print("Solusi tidak ada")
        return False

    printSolusi(sol)
    return True


#fungsi untuk cek langkah
def sebelumdipecahkan(maze, x, y, sol):
    #titik koordinat mulai dan finish
    if x == N - 2 and y == N - 4:
        sol[x][y] = 1
        return True

    #cek jika maze[x][y] benar
    if aman(maze, x, y) == True:
    # tandai kalau kordinat benar
        sol[x][y] = 1

        #ke bawah
        if sebelumdipecahkan(maze, x + 1, y, sol) == True:
            return True

        #jika pindah kebawah ttidak bisa
        #pindah kekanan
        if sebelumdipecahkan(maze, x, y + 1, sol) == True:
            return True
        #jika ke kanan dan bawah tidak bisa
        #pindah kiri
        if sebelumdipecahkan(maze, x, y - 1, sol) == True:
            return True

        sol[x][y] = 0
        return False



if __name__ == "__main__":

    maze = [0, 1, 1, 0, 1, 1, 1, 1],\
           [1, 1, 0, 0, 0, 1, 1, 0],\
           [1, 1, 1, 1, 1, 1, 1, 0],\
           [1, 1, 1, 1, 1, 1, 1, 0],\
           [0, 0, 0, 1, 1, 1, 1, 0],\
           [1, 1, 1, 0, 0, 1, 1, 0],\
           [1, 1, 1, 1, 1, 1, 0, 1],\
           [1, 1, 1, 1, 0, 0, 1, 1]
    pecahkan(maze)