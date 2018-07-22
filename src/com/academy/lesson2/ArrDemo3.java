package lesson2dzdemo;

public class ArrDemo3 {
    public static void main(String[] args) {
        String[] arr = {"*", "**", "***", "****", "*****", "******"};
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("     " + arr[i]);
                    break;

                case 1:
                    System.out.println("    " + arr[i]);
                    break;

                case 2:
                    System.out.println("   " + arr[i]);
                    break;

                case 3:
                    System.out.println("  " + arr[i]);
                    break;

                case 4:
                    System.out.println(" " + arr[i]);
                    break;

                case 5:
                    System.out.println(arr[i]);
                    break;
                default:
                    break;

            }
        }
    }
}
