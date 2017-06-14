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
public class BalancedArray {
    static int solve(int[] a){
        // Complete this function
        int size = a.length;
        int length1 = 0;
        int length2 = 0;
        int biggest1 = 0;
        int biggest2 = 0;
        for(int i =0;i<size;i++) {
            if(i<size/2) {
                length1 += a[i];
                System.out.println("length1 : " + length1);
                if(biggest1 < a[i]) { 
                    biggest1 = a[i];
                    System.out.println(biggest1);
                }
            } else {
                length2 += a[i]; 
                System.out.println("length2 : " + length2);
                if(biggest2 < a[i]) {
                    biggest2 = a[i];
                    System.out.println(biggest2);
                }
            }
        }
        
        if(length1 < length2) {
            return (length2-biggest1);
        } else if (length1 > length2){
            return (length1-biggest2);
        } else {
                 return 0;   
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = solve(a);
        System.out.println(result);
    }
}
