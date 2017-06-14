/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplications;

import java.util.Scanner;

/**
 *
 * @author Pan
 */
public class NumericString {
    static int getMagicNumber(String s, int k, int b, int m){
        // Complete this function
//        String[] str = new String[s.length()-2];
        int sum = 0;
        for(int i=0;i<s.length()-k+1;i++) {
            String numWithK = null;
            int numWithB;
            int numWithM;
            numWithK = s.substring(i, k+i);
            System.out.println("Substring : " + numWithK);
            numWithB = Integer.valueOf(numWithK+"", b);
            System.out.println("numWithB : " + numWithB);
            numWithM = numWithB % m;
            System.out.println("numWithM : " + numWithM);
            sum += numWithM;
            System.out.println("sum : " + sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }
}
