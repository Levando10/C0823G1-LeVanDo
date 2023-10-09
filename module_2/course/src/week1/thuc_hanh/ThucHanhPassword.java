package week1.thuc_hanh;

import java.util.Scanner;

public class ThucHanhPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        while (!pass.equals("out")){
            System.out.println("sai mat khau roi !!!");
            pass = scanner.nextLine();
        }
    }
}