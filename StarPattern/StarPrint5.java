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
public class StarPrint5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1 ; k++) {
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
 ***********
*************
*/