package at.cbtransmatrix;


import java.util.Random;


public class TransMatrix {
    private int zeilen;
    private int spalten;
    int [][] start;
    int [][] ende;

    public TransMatrix(int zeilen, int spalten){
        this.zeilen = zeilen;
        this.spalten = spalten;
    }

    public void fuellen(){
        start = new int [zeilen][spalten];
        Random random = new Random();
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                start[i][j] = random.nextInt(99-11) + 1;
            }
        }
        print(start);
    }

    public void drehen(){
        ende = new int [spalten][zeilen];
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
