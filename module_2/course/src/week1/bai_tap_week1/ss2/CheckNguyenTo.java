package week1.bai_tap_week1.ss2;

import java.util.Scanner;

public class CheckNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên tố : ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(number);
        boolean result = checkPrime(number);
        if (result){
            System.out.print(number + " is a prime!");
        } else {
            System.out.print(number + " is not a prime!");
        }


    }
    public static boolean checkPrime(int number){
        int count = 0;
        for (int i = 1 ; i <= number ; i++){
           if (number % i == 0){
               count++;
           }
        }
        if (count == 2){
            return true;
        } else {
            return false;
        }

    }
}
