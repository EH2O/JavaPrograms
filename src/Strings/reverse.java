package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner in;
        String fill = "src/LoremIpsum.txt";
        try {
            in = new Scanner((new File(fill)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        StringBuilder data = new StringBuilder();
        while(in.hasNextLine()){
            data.append(in.nextLine());
        }

        String rev = "";

        double start = System.currentTimeMillis();
        for (int i = 0; i < data.length(); i++) {
            rev += data.charAt(data.length() - i-1);
        }
        double end =(long) ((System.currentTimeMillis() - start));
        System.out.println(end);

    }
}