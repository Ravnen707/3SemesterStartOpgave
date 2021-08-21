import java.util.Scanner;

public class MainDifferentOptionWhileLoopPlusEkstraOpgave {
        public static void main(String[] args) {
            System.out.println("Hej med dig brug for en hurtig gennemsnit udregning?");
            Scanner scanner = new Scanner(System.in);
            System.out.println("indtast venligt et tal!: ");
            int x = scanner.nextInt();
            System.out.println("Indtast endnu et tal!: ");
            int y = scanner.nextInt();
            int gennemsnitaftal = x + y;
            int hvormangetal = 2;
            int resultat = gennemsnitaftal / hvormangetal;
            System.out.println("Dit gennemsnit af din udregning giver = " + resultat);
            System.out.println("Indtast venligt et nyt tal for at forsætte");
            String ch = scanner.nextLine();
            while (!ch.equalsIgnoreCase("stop")) {
                String y1 = scanner.nextLine();
                if (y1.equalsIgnoreCase("stop") && !isInteger(y1)) {
                    break;
                } else if(!isInteger(y1)){
                   System.out.println("Det du skrev er hverken et 'stop' eller et 'tal'.");
                } else if(isInteger(y1)) {
                    int y2 = Integer.parseInt(y1);
                    gennemsnitaftal = gennemsnitaftal + y2;
                    resultat = gennemsnitaftal / ++hvormangetal;
                    System.out.println("Dit Gennemsnit af din udregning giver = " + resultat);
                }
            }
        }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(Exception e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
}
/*

                                ---------- OPGAVE BESKRIVELSE ----------


      3 Semester: Starts opgave.
        Skriv et program i Java, som kan indlæse tal i en uendelig løkke, og vise gennemsnittet af alle de indlæste tal efter hver indlæsning. Programmet skal producere følgende output:

        Hej med dig!
                Indtast et tal: 5
        Indtast endnu et tal: 3
        Gennemsnittet af de indtastede tal er 4.
        Indtast endnu et tal: 10
        Gennemsnittet af de indtastede tal er 6.
        Indtast endnu et tal: ...

        Ekstraopgave: Den skal holde op med at indlæse tal, når man indtaster Q eller q. Andre bogstaver skal give fejlbesked, men programmet skal fortsætte.

        */
