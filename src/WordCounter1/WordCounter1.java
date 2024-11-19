package WordCounter1;

public class WordCounter1 { //har koll på antal tecken och rader


    //Jag Gör privat så att ingen annan kan ändra på deras värde
    //Lagrar totala tecken och rader som användare har skriver
    //Räknar alla tecken som användaren skriver in
    private int totalCharacters = 0;

    //Räknar alla rader //variabel
    private int totalLines = 0;

    //Uppdaterar totala tecken varje gång användaren skriver ny rad
    //Lägger till längden till raden till totala antalet tecken
    public void addLine(String line) {

        //Tar det aktuella radens längd och adderar till totala summan
        totalCharacters += line.length();

        //Ökar antal rader varje gång användaren skriver ny rad
        totalLines++;

    }

    //Retunerar totala antal tecken
    public int getTotalCharacters() {
        return totalCharacters;

    }

    //Retunerar totala antal rader
    public int getTotalLines() {
        return totalLines;

    }

    }
