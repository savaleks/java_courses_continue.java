package training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteText {

    public static void main(String[] args) {

        File newFile = new File("C:/Users/PC/Desktop/newFile.txt");
        if(newFile.exists())
            //jeigu toks failas jau yra tai java grazins atsakyma;
            System.out.println("Toks failas jau yra");
        else {
            try {
                newFile.createNewFile();
            } catch (Exception e){
                e.printStackTrace();
            }

            try {
                FileWriter filewrite = new FileWriter(newFile);
                BufferedWriter bufferwrite = new BufferedWriter(filewrite);
                bufferwrite.write("This is text sample from java to text file.");
                //tam kad galetu naudotis kitos programos situ failu reikia uzrasyti .close(); uzdarom procesa.
                bufferwrite.close();
                System.out.println("Failas sukurtas");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
