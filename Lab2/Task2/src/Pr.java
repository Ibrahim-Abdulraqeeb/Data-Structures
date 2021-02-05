public class Pr {
    static Integer[] intArray = {10,20,30,40,50,60,70,80,90};
    int[] b=new int[intArray.length];
    public void print (){
        System.out.println("Before");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
        System.out.println();

    }
    public void Copy(){
        System.out.println("After");
        for(int i=0;i<intArray.length;i++) {
            b[i]=intArray[i];
            System.out.print(b[i] + "  ");
        }
    }

    public static void main(String[] args) {
        Pr p=new Pr();
        p.print();
        p.Copy();
        }

    }



