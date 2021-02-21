import java.util.ArrayList;
import java.util.Arrays;
public class GenericMethodMerge {
    public static <T> void reveres(T [] arr){
        int n=arr.length-1;
        for (int i = 0; i <arr.length/2 ; i++) {
            T a=arr[i];
            arr[i]=arr[n];
            arr[n]=a;
            n--;
            System.out.println(arr[i]); } }

    public static <E> void  merge (E a[],E b[]){
        ArrayList<E> m= new ArrayList<>();
        for (int i = 0; i <a.length ; i++) { m.add(a[i]); }
        for (int i = 0; i <b.length ; i++) {m.add(b[i]) ;}
        System.out.print(Arrays.toString(a)+"    ");
        System.out.println( Arrays.toString(b));
        System.out.println("\t\t\t\t\tAfter:");
        System.out.println(m.toString());
    }

    public static void main(String[] args) {
        Integer a[]={11,12,13,14,15};
        String b[]={"Ibrahim","Abdulraqeeb","Qahtan"};
        merge(a,b);
    }}



