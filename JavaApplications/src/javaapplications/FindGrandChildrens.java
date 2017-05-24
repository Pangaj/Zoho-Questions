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
public class FindGrandChildrens {
    public static void main(String[]args) {
        String[][] array = {{"luke","shaw"},{"wayne","rooney"},
                        {"rooney","ronaldo"},{"shaw","rooney"}};
        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();
//        System.out.println(name);
        getGrandsonCount(array);
    }
    
    private static int getGrandsonCount(String[][] array) {
        String arr[] = new String[20];
        int k=0;
        for(int i=0;i<4;i++) {
            if(array[i][1].equals("ronaldo")) {
                arr[k++] = array[i][0];
            }
        }
        int child = 0;
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<4;i++) {
                if(array[i][1].equals(arr[j])) {
                    child++;
                }
            }
        }
        
        System.out.println(child);
        return 0;
    }
}
