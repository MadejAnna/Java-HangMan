package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Demo {

    private static WordsLoader wordsLoader;
    private static Hangman hangman;

    public static void main(String[] arg) {

        wordsLoader = new WordsLoader();
        WordsPicker wordsPicker = new WordsPicker();
        BoardPrinter boardPrinter = new BoardPrinter();
        UserInputReceiver userInputReceiver = new UserInputReceiver();
        TriesCounter triesCounter = new TriesCounter();
        WordChecker wordChecker = new WordChecker(triesCounter);
<<<<<<< HEAD

        wordsLoader = new WordsLoader();
        try {
			wordsLoader.loadWords("src/main/resources/slowa.txt");
			
		} catch (FileNotFoundException e) {
=======
        hangman = new Hangman(wordsPicker, boardPrinter, userInputReceiver, triesCounter, wordChecker);
        
        Set<Integer> guessed = new HashSet<>();
        
        
        guessed.add(1);
        try {
			boardPrinter.printHangMan("Adres e-mail", guessed, 2);
		} catch (IOException e) {
>>>>>>> c70ceac788dd313db8f1cefe7b97377c810147e6
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
<<<<<<< HEAD
        System.out.println("aaa");
=======
>>>>>>> c70ceac788dd313db8f1cefe7b97377c810147e6
 
    }
}
