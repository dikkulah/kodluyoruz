# [22,27,16,2,18,6] dizisinin Insertion short adımları

    1. 22 ile 27 kıyaslanır ve sıralı olduğu için dokunulmaz
        127 ile 16 kıyaslanır 16 küçük olduğu için 16 ile 27 yer değişir daha 
        sonra 22 ile kıyaslarnır ve 16 ile yerdeğişir

        [16,22,27,2,18,6]
    
    2. 27 ile 2 değeri kıyaslanır ve 2 değeri ile yer değişir.
        22 ile 2 kıyaslanır ve yer değişir.
        16 ile 2 kıyaslanır ve yer değişir
        
        [2,16,22,27,18,6]

    3. 27 ile 18 kıyaslanır ve yer değişir
       22 ile 18 kıyaslanır ve yer değişir.
        16 ile kıyaslandığında sonlanır
    
        [2,16,18,22,27,6]
    4. 6 sırası ile hepsi ile kıyaslanır ve yer değişir
        
        [2,6,16,18,22,27]

# Karmaşıklık hesabı ve Big O gösterimi
    Algoritmada her adımda yeni bir eleman sıralanmış kısma dahil olmaktadır. 
    Karmaşık hesabında her bir adımda bütün elemanların gezilmesi söz konusu olduğundan 
    en kötü (Worst Case) durumda O(N^2) olacaktır. En iyi ihtimal (Best Case) ise dizinin
    zaten sıralı veya çoğunlukla sıralı denk gelmesidir. Böyle bir durumda da yine de tüm
    elemanları kontrol edeceğinden N^2 olacaktır. 
# 18 sayısının kapsamı
    Avarage Case

#[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

    1.[3,7,5,8,2,9,4,15,6]  3,7 değişimi
    2.[3,5,7,8,2,9,4,15,6]  5,7 değişii
    3.[2,3,5,7,8,9,4,15,6]  2 saıyısnın sıra ile kıyaslanır ve yer değiştirerek en başa yerleşir.
    4.[2,3,4,5,7,8,9,15,6]  4 sayısını sıra ile kıyaslanır ve yer değiştirerek 3ün önüne yerleşir.
