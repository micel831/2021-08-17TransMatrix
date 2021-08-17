package at.cbtransmatrix;

import java.util.Scanner;

public class TransMatrixTest {
    public static void main(String[] args) {
        TransMatrixTest tmt = new TransMatrixTest();
        tmt.test();
    }
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
