package org.example.chapter02;

public class Z_Review {
    public static void main(String[] args) {

//              *****
//              ****
//              ***
//              **
//              *

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//              *****
//               ****
//                ***
//                 **
//                  *

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 4; j >= rows - i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
