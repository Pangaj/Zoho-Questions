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
public class B1C10D15Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        Boolean produce = false;
        char alpha = 0;
        int digit = 0;
        for(int i=0;i<expression.length();i++) {
            if(Character.isAlphabetic(expression.charAt(i))) {
                alpha = expression.charAt(i);
            } else if(Character.isDigit(expression.charAt(i))) {
                if(i+1 < expression.length()) {
                    if(Character.isDigit(expression.charAt(i+1))) {
                        digit = expression.charAt(i);
                        digit = digit*10 + expression.charAt(++i);
                        produce= true;
                    } else {
                        digit = expression.charAt(i);
                        produce= true;
                    }
                } else {
                    digit = Integer.valueOf(expression.charAt(i));
                    produce= true;
                }
            }
            if(produce) {
                produce= false;
                if(alpha != 0) {
                    for(int j=0;j<digit;j++) {
                        builder.append(alpha);
                    }
                }
            }
        }
        
        System.out.println(builder.toString());
    }
}
