import estadisticas.FileStats;
import estadisticas.Word;

import java.util.ArrayList;
import java.util.Collections;

public class Stats {
    public static void main(String[] args){
        if (args.length!=1){
            System.out.println("Error en el paso de argumentos");
            return;
        }
        String file = args[0];
        FileStats fs = new FileStats(file);
        try {
            ArrayList<String> lista = fs.getPharagraphs();
            ArrayList<String> words = fs.getWords();
            ArrayList<Word> difWords = fs.getDifferentWords();
            Collections.sort(difWords);
            System.out.println("Número de líneas: "+lista.size());
            System.out.println("Número de palabras: "+words.size());
            System.out.println("Número de palabras diferentes: "+difWords.size());
            System.out.println("Palabras ordenadas:");
            System.out.println(difWords);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}