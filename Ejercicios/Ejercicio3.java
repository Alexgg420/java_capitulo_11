package Ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args){
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("fichero1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(String.format("Mix.txt")));

            String line1 = "";
            String line2 = "";

            while ((line1 != null) || (line2 != null)){
                line1 = br1.readLine();
                line2 = br2.readLine();

                if (line1 != null){
                    bw.write(line1 + "\n");
                }

                if (line2 != null){
                    bw.write(line2 + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Error en la lectura o escritura.");
        }
    }
}