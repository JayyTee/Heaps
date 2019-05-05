public class Main
{
    public static void main(String[] args)
    {
        int arr[] = {10, 5, 7, 8, 3, 1, 2, 9, 4, 6};
        int arr2[] = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        int arr3[] = {10, 9, 8, 7 , 6, 5, 4, 3, 2, 1};

        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);
        ob.reset();
        ob.sort(arr2);
        ob.reset();
        ob.sort(arr3);

        System.out.println("Sorted array is");
        HeapSort.printArray(arr);
    }
}
