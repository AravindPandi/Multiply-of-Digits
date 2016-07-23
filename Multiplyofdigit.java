/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Multiplyofdigit {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no.:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q, i = n;
        while (n > 0) {
            q = n % 10;
            n = n / 10;
            i = i * q;
        }
        System.out.println(i);
    }
}
