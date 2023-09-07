import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = "Loc Nguyen Kim Ngoc";
        System.out.println(name);
        String birthday = "01/12/1991";
        System.out.println(birthday);
        String learning = "QTKD";
        System.out.println(learning);
        String reason = "đang theo nghề tester";
        System.out.println(reason);

    }

    public static class bài2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("n: ");
            int n = sc.nextInt();
            if (n >= 2 && n <= 20) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + n * i);
                }
            }
        }
    }

    public static class bài3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("n: ");
            int n = sc.nextInt();
            if(n > 0) {
                int[] array = new int[n];
                for(int i = 0; i < n; i++) {
                    System.out.println("số thứ" + (i + 1) + ": ");
                    array[i] = sc.nextInt();
                }
                System.out.println("Số chẵn: ");
                for(int i = 0; i < n; i++) {
                    if (array[i] % 2 == 0) {
                        System.out.println(array[i]);
                    }
                }

                System.out.println("Số lẻ: ");
                for(int i = 0; i < n; i++) {
                    if (array[i] % 2 != 0) {
                        System.out.println(array[i]);
                    }
                }

            }
        }
    }
    public static class bài4 {
        public static void main(String[] args) {
            int[] array = {2,7,6,8,9,21,34,56,32,12,37};
            int max = 0;
            int position = 0;

            for(int i =0; i < array.length; i++){
                if(array[i] > max){
                   max = array[i];
                   position = i;}}
            System.out.println("max: " + max);
            System.out.println("tổng số đầu + số cuối: " + (array[0] + array[array.length-1]));

            int sumx = 0;
            for(int i =0; i < array.length; i++){
                if (array[i] % 2 == 0) {
                    sumx = sumx + array[i];
                }
            }
            System.out.println("tổng các số chẵn: " + sumx);
                }

            }












}

