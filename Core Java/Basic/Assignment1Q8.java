class BubbleSort{
    public int[] bubbleSort(int arr[]) {
        int n = arr.length,temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr ;
    }
    public void printArray(int arr[])
    {
        int i,n = arr.length;
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
        System.out.println("sorted array is :  " );
        b.printArray(arr);
    }
}