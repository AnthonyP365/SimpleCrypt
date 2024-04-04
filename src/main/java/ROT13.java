import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
//    Instance Variables
    private Character cs;
    private Character cf;


//    Constructors
    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }
    ROT13() {
    }


//    Getters and Setters
    public void setCs(Character cs) {
        this.cs = cs;
    }
    public Character getCs() {
        return cs;
    }
    public void setCf(Character cf) {
        this.cf = cf;
    }
    public Character getCf() {
        return cf;
    }


//    Methods
    public String crypt(String text) throws UnsupportedOperationException {
        return text;
    }

    public static String encrypt(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'm') {
                ch += 13;
            } else if (ch >= 'n' && ch <= 'z') {
                ch -= 13;
            } else if (ch >= 'A' && ch <= 'M') {
                ch += 13;
            } else if (ch >= 'N' && ch <= 'Z') {
                ch -= 13;
            }
            encodedText.append(ch);
        }
        return encodedText.toString();
    }

    public String decrypt(String text) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'm') {
                ch += 13;
            } else if (ch >= 'n' && ch <= 'z') {
                ch -= 13;
            } else if (ch >= 'A' && ch <= 'M') {
                ch += 13;
            } else if (ch >= 'N' && ch <= 'Z') {
                ch -= 13;
            }
            decodedText.append(ch);
        }
        return decodedText.toString();
    }

    public static String rotate(String s, Character c) {
        StringBuilder result = new StringBuilder();
        int shiftNum = s.indexOf(c);
        for (int i = 0; i < s.length(); i++) {
            int shiftedPosition = (shiftNum + i) % s.length();
            result.append(s.charAt(shiftedPosition));
        }
        return result.toString();
    }

    public static void encryptFile() {
        try {
            String text1 = "/Users/anthony/Documents/Projects/SimpleCrypt/sonnet18.txt";
            String text2 = "/Users/anthony/Documents/Projects/SimpleCrypt/sonnet18.enc";
            String text3 = "/Users/anthony/Documents/Projects/SimpleCrypt/sonnet18.denc";
            Scanner fileScan = new Scanner(new File (text2));
            PrintWriter filePrint = new PrintWriter(text3);
            while (fileScan.hasNext()) {
                String fileIn = fileScan.nextLine();
                String textEnc = encrypt(fileIn);
                filePrint.println(textEnc);
            }
            filePrint.close();
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

    public static void main(String[] args) {
        encryptFile();
    }
}
