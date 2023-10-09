package week1.bai_tap_week1.ss2;

import java.util.Scanner;

public class MenuUngDung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int choice = 1;
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1 ; i <=5 ; i++){
                        for (int j = 1 ; j <= 5 ; j++){
                            if (i >= j){
                                System.out.print("*  ");
                            }
                        }
                        System.out.print("\n\n");
                    }
                    break;
                case 2:
                    for (int i = 1 ; i <= 5 ; i++){
                       for ( int j = 1 ; j <= 5 ; j++){
                           if (i <=j || i > j){
                               System.out.print(" * ");
                           }
                       }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                  for (int i = 0 ; i < 3 ; i++){
                      for (int j = 0 ; j < 7 ; j++){
                          if (i <= j || i >= j){
                              System.out.print(" * ");
                          }
                      }
                      System.out.print("\n\n");
                  }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice1");
            }
        }




    }
}
