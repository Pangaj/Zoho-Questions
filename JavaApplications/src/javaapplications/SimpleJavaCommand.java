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
public class SimpleJavaCommand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        // Process each command
        String cmd = null;
        String fileName = null;
        String[] fileNames = new String[10000];
        for(int a0 = 0; a0 < q; a0++){
            // Read the first string denoting the command type
            String command = in.nextLine();
            // Write additional code to read the command's file name(s) and process the command
            // Print the output string appropriate to the command
            String[] str = command.split(" ");
            System.out.println(str[0]);
            System.out.println(str[1]);
        }
    }
}
