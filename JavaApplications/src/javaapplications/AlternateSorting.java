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
public class AlternateSorting {
    public static void main(String[] args) {
        int[] inc = {11,2,100,5,3,10,6,7};
        for(int j=0;j<inc.length;j++) {
            for(int i=0;i<inc.length-1 && i <inc.length-j;i++) {
                if(inc[i]>inc[i+1]) {
                    int temp = inc[i];
                    inc[i]= inc[i+1];
                    inc[i+1]=temp;
                }
            }
        }
        
        int[] altSort = new int[20];
        int k=0;
        for(int i=0, j=inc.length-1;i<j;i++,j--) {
            altSort[k++] = inc[i];
            altSort[k++] = inc[j];
            
        }
        
        for(int i=0;i<inc.length;i++) {
            System.out.print(inc[i]+" ");
        }
        
        System.out.println();
        
        for(int i=0;i<inc.length;i++) {
            System.out.print(altSort[i]+" ");
        }
    }
}
