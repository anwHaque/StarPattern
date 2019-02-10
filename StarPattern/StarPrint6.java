/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starprint1;

/**
 *
 * @author Anwar
 */
public class StarPrint6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int p = 1; p <= i; p++) {
                System.out.print(" ");
            }
            for (int q = 4*2-1; q >= i*2-1; q--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/