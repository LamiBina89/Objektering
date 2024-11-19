package WordCounter1;
//Importerar scanner för att ta emot text från användaren.

import java.util.Scanner;


public class WordCounter {

    public static void main(String[] args) {
        // Scanner som ska läsa in text från kommandoraden.
        Scanner scanner = new Scanner(System.in);

        // Deklarerar variabler för att hålla koll på totala tecken och rader.
        // Total antal tecken
        int totalCharacters = 0;
        // Total antal rader
        int totalLines = 0;

        // Info till användaren vad ska göras.
        System.out.println("Skriv en rad eller 'stop' för att avsluta:");
        WordCounter1 wordCounter1 =  new WordCounter1();


        // Behöver en loop för läsa in text tills användaren skriver "stop".

        while (true) {
            //Läser input från användaren.
            String line = scanner.nextLine();

            // Kontrollerar om raden är "stop" .
            if (line.equalsIgnoreCase("stop")) {
                // Bryter loopen om användaren skriver "stop".
                break;
            }

            wordCounter1.addLine(line);
        }

        // När loopen bryts, skriver ut resultat
        System.out.println("Antal tecken: " + wordCounter1.getTotalCharacters() ); // Visar totala tecken
        System.out.println("Antal rader: " + wordCounter1.getTotalLines()); // Visar totala rader


        scanner.close();
    }
}
