package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {

            Scanner in;
            String fill = "src/Strings/LoremIpsum.txt";
            try {
                in = new Scanner((new File(fill)));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            StringBuilder data = new StringBuilder();
            while(in.hasNextLine()){
                data.append(in.nextLine());
            }

            int  count = 0;

            double start = System.currentTimeMillis();
            for (int i = 0; i < data.length(); i++) {
                if(data.charAt(i) == 'a'){
                    count++;
                }
            }
        double end =(long) ((System.currentTimeMillis() - start ));
        System.out.println(end +" "+ count);
    }
}

