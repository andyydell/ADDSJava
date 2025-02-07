//Andy Dell'Orfano
//1/30/25
package MowerProject.Mow;
import java.util.Scanner;
import java.util.Arrays;
public class Yard {
    private char[][] lawn;
    public Yard(int height, int width){
        lawn = new char[height+2][width+2];
         for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                if (i == 0 || i == lawn.length - 1 || j == 0 || j == lawn[i].length - 1) {
                    lawn[i][j] = 'R'; 
                } else {
                    lawn[i][j] = '+'; 
                }
            }
         }
    }
    public char getValue(int row, int col){
        return lawn[row][col];
    }
    public void setValue(int row, int col, char newValue){
        if (lawn[row][col] != 'R') {
            lawn[row][col] = newValue;
        }
    }
    public int getHeight(){
        return lawn.length -2;
    }
    public int getWidth(){
        return lawn[0].length -2;
    }
    public void printLawn(Mower mower){
        int mowerRow = mower.row();
        int mowerCol = mower.col();
        int mowerDir = mower.getDirection(); 
        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                if (i == mowerRow && j == mowerCol) {
                    System.out.print(mower.getDirectionSymbol()); 
                } else {
                    System.out.print(lawn[i][j]); 
                }
            }
            System.out.println();
        }
    }                        
}
