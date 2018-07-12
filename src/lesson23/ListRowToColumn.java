package lesson23;

import java.io.BufferedReader;
import java.io.FileReader;

class ListRowToColumn {

    public static void main(String[] args) throws Exception{
        FileReader myFile = new FileReader("C:/Users/PC/Desktop/array.txt");
        BufferedReader bufferedReader = new BufferedReader(myFile);
        String tekstas = "";
        String eilute = bufferedReader.readLine();
        while (eilute != null){
            tekstas += eilute;
            eilute = bufferedReader.readLine();
        }
        bufferedReader.close();
        String mysz2 = tekstas.replaceAll("\\s","");
        String emails = mysz2.replaceAll(",", "\n");
        System.out.println(emails);
    }
}
