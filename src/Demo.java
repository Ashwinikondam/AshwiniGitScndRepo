public class Demo {



    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 5;
        a[4] = 6;
        // System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) != a[i]) {
                System.out.println("missingnumber: "+(i + 1))  ;
                break;
                //  } else {
                //    System.out.println("Value is equal !!!");

            }
        }
    }
}