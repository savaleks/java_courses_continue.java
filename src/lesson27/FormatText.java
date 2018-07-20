package lesson27;

import java.io.*;
import java.util.*;

public class FormatText {

    public static void main(String[] args) throws IOException {
        countWords();
    }

    public static void countWords() throws IOException {
        String textFileLocation = "C:/Users/PC/Desktop/webpage.txt";
        String readWords = "";
        ArrayList<String> extractOnlyWordsFromTextFile = new ArrayList<>();
        String[] excludedSymbols = {" ", ",", ".", "/", ":", ";", "<", ">", "*", "(", ")", "-", "1",
        "2", "3", "4", "5", "6", "7", "8", "9", "'", "\"", "0", "]", "["};
        String readByteCharByChar = "";
        boolean testIfWord = false;


        try {
            InputStream inputStream = new FileInputStream(textFileLocation);
            byte byte1 = (byte) inputStream.read();
            while (byte1 != -1) {

                readByteCharByChar += String.valueOf((char) byte1);
                for (int i = 0; i < excludedSymbols.length; i++) {
                    if (readByteCharByChar.equals(excludedSymbols[i])) {
                        if (!readWords.equals("")) {
                            extractOnlyWordsFromTextFile.add(readWords.toLowerCase());
                        }
                        readWords = "";
                        testIfWord = true;
                        break;
                    }
                }
                if (!testIfWord) {
                    readWords += (char) byte1;
                }
                readByteCharByChar = "";
                testIfWord = false;
                byte1 = (byte) inputStream.read();
                if (byte1 == -1 && !readWords.equals("")) {
                    extractOnlyWordsFromTextFile.add(readWords);
                }
            }
            inputStream.close();

            FileWriter file = new FileWriter("C:/Users/PC/Desktop/formatfile.txt");
            file.write(extractOnlyWordsFromTextFile.toString().replaceAll(",", ""));
            file.flush();
            file.close();

           // System.out.println(extractOnlyWordsFromTextFile);
            System.out.println("The number of words in the choosen text file are: " + extractOnlyWordsFromTextFile.size());
        } catch (IOException ioException) {

            ioException.printStackTrace();
        }

        HashMap<String, Integer> map = new HashMap<>();
        Scanner textreading = new Scanner(new File("C:/Users/PC/Desktop/formatfile.txt"));
        while (textreading.hasNext()) {
            String word = textreading.next();
            if (map.containsKey(word)) {
                int count = map.get(word) + 1;
                map.put(word, count);

            } else {
                map.put(word, 1);
            }
        }
        textreading.close();

        Map<String, Integer> result = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        for (Map.Entry<String, Integer> wordCounting : result.entrySet()) {
            System.out.println(wordCounting);

        }
    }
}


