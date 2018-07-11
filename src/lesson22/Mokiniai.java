package lesson22;

/*
Tarkime, kad turime Mokinių klasės objektų sąrašą. Parašykite
metodus kurie galėtų išsaugoti mokinių sąrašą faile ir nuskaityti
mokinius iš failo.
** Pabandykite padaryti, kad informacija būtų išsaugoma
tekstiniame pavidale, t.y. ją būtų galima paprastai perskaityti
atsidarius failą.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Mokiniai {
    public static void main(String[] args) {
        File mokinys = new File("C:/Users/PC/Desktop/mokiniai2.txt");
        if(mokinys.exists())
            System.out.println("Toks failas jau yra.");
        else{
            try{
                mokinys.createNewFile();
            } catch (Exception e){
                e.printStackTrace();
            }

            try{
                FileWriter file = new FileWriter(mokinys);
                BufferedWriter buffer = new BufferedWriter(file);
                String newLine = System.getProperty("line.separator");
                buffer.write("Mokiniai:" + newLine +
                        "1. Petras Petraitis " + newLine +
                        "2. Jonas Jonaitis " + newLine +
                        "3. Vardas Pavardenis");
                buffer.close();
                System.out.println("Failas sukurtas");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
