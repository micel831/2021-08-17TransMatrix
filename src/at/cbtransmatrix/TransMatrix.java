package at.cbtransmatrix;


import java.util.Random;
import java.util.Scanner;

public class TransMatrix {
    private int zeilen;
    private int spalten;

    private int [][] start = new int [zeilen][spalten];
    private int [][] ende = new int [spalten][zeilen];

    public static void main(String[] args) {
        TransMatrix tm = new TransMatrix();
        tm.eingabe();
        tm.fuellen();
        tm.drehen();
    }

    public void eingabe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviele Zeilen soll die Matrix haben?");
        zeilen = scanner.nextInt();
        System.out.println("Wieviele Spalten soll die Matrix haben?");
        spalten = scanner.nextInt();
    }

    public void fuellen(){
        //System.out.println("Zeilen: " + zeilen + " Spalten: " + spalten);
        Random random = new Random();
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                start[i][j] = random.nextInt(99-11) + 1;
            }
        }
        print(start);
    }

    public void drehen(){
        for (int i = 0; i < zeilen; i++){
            for (int j = 0; j < spalten; j++){
                ende[j][i] = start[i][j];
            }
        }
        print(ende);
    }

    public void print(int [][]demo){
        System.out.println("-------------------");
        for(int i = 0; i < demo.length; i++){
            System.out.println();
            for(int j = 0; j < demo[i].length; j++){
                System.out.print(demo[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
