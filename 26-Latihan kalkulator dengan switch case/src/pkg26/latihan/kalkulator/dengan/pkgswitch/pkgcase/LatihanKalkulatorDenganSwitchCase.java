/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.latihan.kalkulator.dengan.pkgswitch.pkgcase;

import java.util.Scanner;

/**
 * Nama  : Hafid Fadhil
 * NIM   : A2.1900075
 * Kelas : TI-1C
 */
public class LatihanKalkulatorDenganSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
}
