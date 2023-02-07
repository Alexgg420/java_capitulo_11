package Ejercicios;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1{
    public static void main(String[] args){
        Primos conjunto = new Primos(2, 500);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(String.format("primos.dat")));
            bw.write(String.format("%s", conjunto));
            bw.close();
        } catch (IOException ex){
            System.out.println("Error de lectura");
        }
    }
}