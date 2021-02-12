import java.util.*;
public class Pr

{
    public static void morethanNdK(int a[], int n, int k)
    {
        int x = n / k;

        HashMap<Integer, Integer> y = new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);

            else
            {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }
        for (Map.Entry m : y.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }

    public static void main(String[] args)
    {

        int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,1, 1, 3, 1, 1, 1 ,2};
        int n = 12;
        int k = 5;
        System.out.print("The repeated component more than five times: ");
        morethanNdK(a, n, k);
    }
}
