package estadisticas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class FileStats {

    private String file;

    public FileStats(String fileName){
        this.file = fileName;
    }

    public String getFile(){
        return this.file;
    }

    private static String reduceBlanks(String entry){
        return entry.trim().replaceAll("\\s+", " ");
    }

    private String replaceIfNotAlphabetic(String text, char replaceBy){
        for (int i = 0; i < text.length(); i++){
            if (!Character.isAlphabetic(text.charAt(i))){
                text = text.replace(text.charAt(i), replaceBy);
            }
        }
        return text;
    }

    public ArrayList<Word> getDifferentWords() throws Exception{
        HashMap<String, Word> words = new HashMap<String, Word>();
        ArrayList<Word> wordsToReturn = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String line;
            while((line=br.readLine()) != null){
                line = reduceBlanks(replaceIfNotAlphabetic(line, ' '));
                String[] wordsArray = line.split(" ");
                for (int i = 0; i < wordsArray.length; i++){
                    if (wordsArray[i] != null && !wordsArray[i].equals("")){
                        if (words.containsKey(wordsArray[i])){
                            Word w = words.get(wordsArray[i]);
                            w.inc();
                            words.put(wordsArray[i], w);
                        } else {
                            words.put(wordsArray[i], new Word(wordsArray[i], 1));
                        }
                    }
                }
            }
            for (Word w : words.values()){
                wordsToReturn.add(w);
            }
            br.close();
        } catch (Exception e){
            throw e;
        }
        return wordsToReturn;
    }

    public ArrayList<String> getWords() throws Exception{
        ArrayList<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String line;
            while((line=br.readLine())!= null){
                line = reduceBlanks(replaceIfNotAlphabetic(line, ' '));
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++){
                    if(words[i] != null && !words[i].equals("")){
                        lista.add(words[i]);
                    }
                }
            }
            br.close();
        } catch (Exception e) {  
            throw e;
        }
        return lista;
    }

    public ArrayList<String> getPharagraphs() throws Exception{
        ArrayList<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.file));
            String linea;
            while((linea=br.readLine())!= null){
                lista.add(linea);
            }
            br.close();
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }
}