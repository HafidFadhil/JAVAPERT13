/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41.looping.array.dengan.pkgfor.each;
import java.util.Arrays;

/**
 * Nama  : Hafid Fadhil
 * NIM   : A2.1900075
 * Kelas : TI-1C
 */
public class LoopingArrayDenganForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};


        // looping standard
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }

        // looping dengan properti array
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }

        // looping khususon untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);
        }
    }
}
