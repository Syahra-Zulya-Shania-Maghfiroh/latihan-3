/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsipengembaliannilai;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memberi inputan
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        int a,b,c;
        //output
        System.out.println("Program Menjumlahkan 2 Nilai");
        System.out.print("Masukkan nilai a : ");
        //input a dari user
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        //input b dari user
        b = masukan.nextInt();
        System.out.print("Masukkan nilai c : ");
        //input c dari user
        c = masukan.nextInt();
        System.out.println();
        //hasil output
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
    }
    //kontruktor
    //fungsi pengembalian nilai jumlah
    private static int jumlah(int a, int b){
    int hasil = a+b;
    return hasil;
    }
}
