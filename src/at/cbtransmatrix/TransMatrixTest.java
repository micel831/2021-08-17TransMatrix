package at.cbtransmatrix;

import java.util.Scanner;


        /*
        *Autor: Schuh Michael
        *Datum: 17.8.2021
        * letze Änderung: 18.8.21
        * Version: 1.0
        * Beschreibung: Programm zum erstellen, speichern,
        * und drehen eines zweidimensionalen Arrays mit automatisch
        * generrierten Zahlen
        */

public class TransMatrixTest {
    public static void main(String[] args) {
        TransMatrixTest tmt = new TransMatrixTest();
        tmt.test();
    }

    //Methode zum eingeben von Zeilen und Spalten des Arrays und zur
    //Werte übergabe
    public void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Zeilen soll die Matrix haben?");
        int zeilen = scanner.nextInt();
        System.out.println("Wieviele Spalten soll die Matrix haben?");
        int spalten = scanner.nextInt();
        TransMatrix tt = new TransMatrix(zeilen, spalten);
        tt.fuellen();
        tt.drehen();
    }
}
