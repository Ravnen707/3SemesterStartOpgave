import java.util.Scanner;

public class MainDifferentOptionSwitch {
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

        System.out.println("_________________________________________________________________________________");

        System.out.println("Vælg om du vil ligge flere tal til din udregning eller stoppe. (Hvis forsættelse forsætte den max. 10 gange til.)");
        System.out.println(" '1' for at forsætte eller '2' for at stoppe ");
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner1.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Forsæt");

                for (int i = 0; i < 10; i++) {

                    y = scanner.nextInt();
                    gennemsnitaftal = gennemsnitaftal + y;
                    resultat = gennemsnitaftal / ++hvormangetal;
                    System.out.println("Dit Gennemsnit af din udregning giver = " + resultat);
                }
            case 2:
                System.out.println("stop");
                break;
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

