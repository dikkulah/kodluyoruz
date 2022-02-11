#  Merge short [16,21,11,8,12,22]
1. [16,21,11] [8,12,22] olarak yiye bölünür
2. [16] [21,11]  -  [8,12] [22] şeklinde tekrar bölünür
3. [16] [21]  [11]        [8] [12] [22] şeklinde tamamen parçalara ayırılır
4. adım    
   1. 16 ile 21 kıyaslanır, daha sonra [16,21] şeklinde yeni hücre oluşur.
   2. 11 ile 8 kıyaslanır , daha sonra [8,11] şeklinde yeni hücre oluşur.
   3. 12 ile 22 kıyaslanır, daha sonra [12,22] şeklinde yeni hücre oluşur.

### [16,21] [8,11] [12,22]
    
   16 ile 8 kıyaslanır ve 8 daha küük olduğu için yazılır.
   16 ile 11 kıyaslanır ve 16 daha küçük olduğu için yazılır, daha sonra 16 ile 21 eklenir.

### [8,11,16,21] - [12,22] şeklinde bir dizi oluşur.
     
5. adım
   1. 8 ile 12 kıyaslanır ve 8 yazılır.
   2. 11 ile 12 kıaslanır ve 11 yazılır.
   3. 16 ile 12 kıyaslarır ve 12 yazılır.
   4. 16 ile 22 kıyaslanır ve 16 yazılır.
   5. 21 ile 22 kıyaslanır ve 21 yazılır.
   6. ve son olarak 22 eklenir.
# [8,11,12,16,21,22]
#Big gösterimi O(n log(n))

    
    