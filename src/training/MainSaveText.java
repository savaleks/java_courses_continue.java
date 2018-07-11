package training;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainSaveText {
        //kad isvengti klaidos(jeigu nera tokio tekstinio failo) mums reikia prideti exception;
    public static void main(String[] args) throws Exception {
        //pirmiausiai reikia inicializuoti objekta;
        FileReader file = new FileReader("C:/Users/PC/Desktop/textToJava.txt");
        BufferedReader reader = new BufferedReader(file);
        //inicializuojam text kaip tuscia vieta;
        String text = "";
        //reader.readLine skaitys eilute po eilute;
        String line = reader.readLine();
        while (line != null){
            text += line;
            line = reader.readLine();
        }
        //nurodo kad pakeitimai nepalies faila;
        reader.close();
        System.out.println(text);
    }
}
