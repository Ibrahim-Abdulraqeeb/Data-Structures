interface Reverse<T> {
    static Integer[] intArr = {1, 2, 3, 4, 5};
    static double[] doubleArr = {1.2, 1.6, 1.6, 5.6};
    static Character[] charArr = {'S', 'A', 'M', 'P', 'l', 'E'};
    static String[] strArr = {"Ibrahim", "Abdulraqeeb", "Qahtan"};
    static float[] floatArr = {1.2f, 1.6f, 1.6f, 5.6f};

    public static <T> void GenericReverse(T[] array) {
        int x = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            T temp = array[i];
            array[i]=array[x];
            array[x] = temp;
            x--;
        }
    }

    public static <a> void Print(a[] array) {
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if (i<array.length-1)
                System.out.print(array[i]+"   ");
            else
                System.out.print(array[i]+"]");
        }


    }


    public static void
    main(String[] args) {
        Print(intArr);
        GenericReverse(intArr);
        GenericReverse(charArr);
        System.out.println();
        Print(intArr);
        Print(charArr);


    }
}


