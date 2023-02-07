package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4{
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("fichero1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("fichero1sort.txt"));

            ArrayList<String> ar = new ArrayList<String>();
            String line1 = "";
            while (line1 != null){
                ar.add(line1);
                line1 = br.readLine();
            }
            br.close();
            Collections.sort(ar);
            for (String s : ar){
                bw.write(s + "\n");
            }
            bw.close();
        } catch (IOException e){
            // TODO: handle exception
        }
    }
}