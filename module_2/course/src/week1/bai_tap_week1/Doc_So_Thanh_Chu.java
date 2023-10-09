package week1.bai_tap_week1;

import java.util.Scanner;

public class Doc_So_Thanh_Chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc : ");
        int number = scanner.nextInt();
        int tens = number / 10;
        int ones = number % 10;
        int threeFirst = number / 100;
        String tempOnes = " ";
        String tempTens = " ";
        String tempUp20 = " ";
        String tempUp100 = " ";
        String tempFirst100 = " ";
        String result = " ";
        switch (ones) {
            case 1:
                tempOnes += "One";
                break;
            case 2:
                tempOnes += "two";
                break;
            case 3:
                tempOnes += "three";
                break;
            case 4:
                tempOnes += "four";
                break;
            case 5:
                tempOnes += "five";
                break;
            case 6:
                tempOnes += "six";
                break;
            case 7:
                tempOnes += "seven";
                break;
            case 8:
                tempOnes += "eight";
                break;
            case 9:
                tempOnes += "nine";
                break;

        }

        switch (ones) {
            case 1:
                tempUp20 += "Eleven";
                break;
            case 2:
                tempUp20 += "Twelve";
                break;
            case 3:
                tempUp20 += "Thirteen";
                break;
            case 4:
                tempUp20 += "Fourteen";
                break;
            case 5:
                tempUp20 += "Fifteen";
                break;
            case 6:
                tempUp20 += "Sixteen";
                break;
            case 7:
                tempUp20 += "Seventeen";
                break;
            case 8:
                tempUp20 += "Eighteen";
                break;
            case 9:
                tempUp20 += "Nineteen";
                break;
            case 0:
                tempUp20 += "Ten";
                break;

        }

        switch (tens) {
            case 2:
                tempTens += "Twenty";
                break;
            case 3:
                tempTens += "Thirty";
                break;

            case 4:
                tempTens += "Forty";
                break;
            case 5:
                tempTens += "Fifty";
                break;
            case 6:
                tempTens += "Sixty";
                break;
            case 7:
                tempTens += "Seventy";
                break;
            case 8:
                tempTens += "Eighty";
                break;
            case 9:
                tempTens += "Ninety";
                break;

        }
        switch (threeFirst) {
            case 1:
                tempFirst100 = "One";
                break;
            case 2:
                tempFirst100 = "two";
                break;
            case 3:
                tempFirst100 = "three";
                break;
            case 4:
                tempFirst100 = "four";
                break;
            case 5:
                tempFirst100 = "five";
                break;
            case 6:
                tempFirst100 = "six";
                break;
            case 7:
                tempFirst100 = "seven";
                break;
            case 8:
                tempFirst100 = "eight";
                break;
            case 9:
                tempFirst100 = "nine";
                break;

        }



        if (number < 10) {
            result = tempOnes;
        } else if (number < 20) {
            result = tempUp20;
        } else if (number <= 99) {
            result = tempTens + tempOnes;
        } else if (number <= 999) {

            result += tempFirst100 + " hundred and " ;
            number = number % 100;
            tens = number / 10;
            switch (tens) {
                case 2:
                    tempTens += "Twenty";
                    break;
                case 3:
                    tempTens += "Thirty";
                    break;

                case 4:
                    tempTens += "Forty";
                    break;
                case 5:
                    tempTens += "Fifty";
                    break;
                case 6:
                    tempTens += "Sixty";
                    break;
                case 7:
                    tempTens += "Seventy";
                    break;
                case 8:
                    tempTens += "Eighty";
                    break;
                case 9:
                    tempTens += "Ninety";
                    break;

            }
            result += tempTens + tempOnes;

        }

        System.out.println(result);


    }
}
