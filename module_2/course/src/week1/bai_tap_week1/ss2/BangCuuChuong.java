package week1.bai_tap_week1.ss2;

public class BangCuuChuong {
    public static void main(String[] args) {


        System.out.println("\n———————————————————————————————————————————————————————————————————————————————————————————————————————");

        for (int i = 1; i <= 9; i++) {
            System.out.print("Bang cuu chuong : " + i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf(" " + "%8d", i * j);
            }
            System.out.print("\n");
        }

    }
}
