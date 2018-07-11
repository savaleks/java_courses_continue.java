package lesson22;

import java.io.BufferedReader;
import java.io.FileReader;

class MokiniuReader {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("C:/Users/PC/Desktop/mokiniai2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String newline = System.getProperty("line.separator");
        String tekstas = "";
        String eilute = bufferedReader.readLine();
        while (eilute != null){
            tekstas += eilute + newline;
            eilute = bufferedReader.readLine();
        }
        bufferedReader.close();
        System.out.println(tekstas);
    }
}
/*
output
mokiniai:
1. Petras Petraitis
2. Jonas Jonaitis
3. Vardas Pavardenis

 */
