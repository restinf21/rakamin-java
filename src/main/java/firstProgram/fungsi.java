package firstProgram;

import firstProgram.NamaKu;
import contoh.hasil;

public class fungsi {
    public static void main(String[] args){
        int x = 5;
        int y = 2;
        int z = 10;
        int v = 6;

        NamaKu.resti("Resti noor f");
        NamaKu.resti("Jafar");
        hasil.printNama("ini beda package");
        hasil.printNama("Contoh git");

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
        tambah(z,v);
    }

    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+ " dan "+b+" adalah "+hasilTambah);
        return hasilTambah;
    }
}
