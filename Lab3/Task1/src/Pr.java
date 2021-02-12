public class Pr{
    static int findRepeating(int[] arr, int n)
    {

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum - (((n - 1) * n) / 2) ;
    }

    public static void main(String args[])
    {
        int[] arr = { 9, 9, 2, 6, 1, 8, 5, 3, 4, 7 };
        int n = arr.length;
        System.out.print("The recurring component is:");
        System.out.println(findRepeating(arr, n));
    }
}




