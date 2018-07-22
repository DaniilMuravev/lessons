package lesson2dzdemo;

public class ArrDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 121, 12321, 121, 1};
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("  " + arr[i]);
                    break;

                case 1:
                    System.out.println(" " + arr[i]);
                    break;
                case 2:
                    System.out.println("" + arr[i]);
                    break;

                case 3:
                    System.out.println(" " + arr[i]);
                    break;

                case 4:
                    System.out.println("  " + arr[i]);
                    break;
                default:
                    break;
            }


        }
    }
}

