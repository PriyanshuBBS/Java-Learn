public class java_28 {
    public static void main(String[] args) {
     
        // Problem 5 : Reversing an Array
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2); // Lowest Integer
        // int temp;

        // for (int i = 0; i < n; i++) {
        //     // swap a[i] and a[l-1-i]
        //     temp = arr[i];
        //     arr[i] = arr[l - i - 1];
        //     arr[l - i - 1] = temp;
        // }

        // for (int element : arr) {
        //     System.out.print(element + " ");
        // }
        // Integer.MIN_VALUE substitue of INT_MIN

        // Problem : Sorted or Not
        boolean isSorted = true;
        int[] arr = { 1, 12, 3, 4, 5, 34, 67};
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) 
        {
            System.out.println("The Array is sorted");
        } 
        else 
        {
            System.out.println("The Array is not sorted");
        }

    }
}
