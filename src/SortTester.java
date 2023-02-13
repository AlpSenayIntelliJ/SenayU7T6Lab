import java.util.Arrays;

public class SortTester
{
    public static void main(String[] args)
    {
        /* --- SELECTION SORT --- */
        int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        System.out.println(Arrays.toString(arr1));
        Sort.selectionSort(arr1);

        /* --- INSERTION SORT --- */
        int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        System.out.println(Arrays.toString(arr2));
        Sort.insertionSort(arr2);
    }
}
