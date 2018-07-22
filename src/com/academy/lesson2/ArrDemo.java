package lesson2dzdemo;

public class ArrDemo {
    public static void main(String[] args) {
        int[][] arr = {{1}, {1, 2, 1}, {1, 2, 3, 2, 1}, {1, 2, 1}, {1}};
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("  ");
                    break;

                case 1:
                    System.out.print(" ");
                    break;

                case 3:
                    System.out.print(" ");
                    break;

                case 4:
                    System.out.print("  ");
                    break;
                default:
                    break;
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

