package se.lexicon;

import java.util.Scanner;

public class Player {
    public  static Scanner scanner=new Scanner(System.in);
    boolean play;


    public char inputALetter(){
        char guessLetter= scanner.next().charAt(0);
        return guessLetter;
    }
    public String inputAWord(){
        String guessedWord=scanner.next();
        return  guessedWord;
    }
   /* // inputALetter mehtod overloading
    public String input(char playerGuess){
        String strGussesWord= scanner.next();
        return strGussesWord;}*/
    }

