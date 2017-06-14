/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplications;

/**
 *
 * @author Pan
 */
public class ZohoQuestionProgram {
   public static void main(String[] args) {
       String str= "PROGRAM";
       
       for(int i=0;i<str.length();i++) {
           for(int j =0;j<str.length();j++) {
               if(j==i){
                System.out.print(str.charAt(j));
               } else if(j== str.length()-i-1) {
                   System.out.print(str.charAt(j));
               }else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   } 
}
