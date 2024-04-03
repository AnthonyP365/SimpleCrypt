import java.io.File;
import java.io.FileNotFoundException;
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

    public String encrypt(String text) {
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

//    Make a method that reads a textfile (sonnet18.txt),
//    encrypts it,
//    and writes it back out to a different file (sonnet18.enc)
//    Prove that when you read in (sonnet18.enc),
//    run the same crypt again,
//    and prove that it produces the same original text.

//    The basic process to read in from file is the following:
//    Create an Scanner object using the input file
//    Loop through each line and read it in
//    After reading in the line, process the line
//    Move on to the next line
//    Exit the loop after reading in all lines.

//    Writing to an output file is similar to our input.
//    The most common way to do this in Java is using the print writer.
//    After importing the PrintWriter,
//    we simply create a new file,
//    write to it using println commands and then close it.

    public void fileEncrypt(String filename){
        Scanner scan = new Scanner();
        File fileReader = new File(filename);
        File fileWriter = new File(encryptedFile);
        try {


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
