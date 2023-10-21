package firstProgram;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password : ");
        String validPassword = "password";

        //Jika benar maka selamat datang bos
        //Jika salah (else) maka error message
        if(password.equals(validPassword)){
            System.out.println("Selamat datang bos!!!!");
        }else{
            System.out.println("Password salah, coba lagi");
        }
        System.out.println("Terima Kasih sudah menggunakan aplikasi kami");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return  scanner.nextLine();
    }
}