package Ejercicios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2{
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            String print = "";
            while (print != null){
                System.out.println(print);
                print = br.readLine();
            }
            System.out.println();
            br.close();
        } catch (IOException e){
            System.out.println("Error de lectura");
        }
    }
}