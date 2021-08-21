import java.util.Scanner;

public class Main {
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
            for (int i = 0; i < 10; i++) {
                System.out.println("Hvis du gerne vil forsætte udregningen af gennemsnit");
                System.out.println("Bedes du venligst indtaste det næste tal for at forsætte: ");
                y = scanner.nextInt();
                gennemsnitaftal = gennemsnitaftal + y;
                resultat = gennemsnitaftal / ++hvormangetal;
                System.out.println("Dit Gennemsnit af din udregning giver = " + resultat);
                }

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
