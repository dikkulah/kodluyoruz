public class InsertionShort {
    public static void main(String[] args) {

        int[] arr = {22, 27, 16, 2, 18, 6};
        insertionSort(arr);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int deger = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > deger) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = deger;
        }
    }
}
