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
public class WelcomeToZoho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "WELCOMETOZOHOCORPORATION";
        Integer a = (int) Math.ceil(Math.sqrt(str.length()));
//         System.out.print(a);
         
        char[][] array = new char[a][a];
        
        for(int i =0, k=0;i<a && k < str.length();i++) {
            for(int j=0;j<a && k<str.length();j++,k++) {
                array[i][j] = str.charAt(k);
            }
        }
        
        for(int i=0;i<a;i++) {
            for(int j=0;j<a;j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    
}
