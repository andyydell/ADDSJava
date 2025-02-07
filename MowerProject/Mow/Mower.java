package MowerProject.Mow;
import MowerProject.Mow.Yard;
import java.util.Scanner;
public class Mower{
    private int vertPos = 0;
    private int horPos = 0;
    public Mower(int vert, int hor){
        vertPos = vert;
        horPos = hor;
    }
    private int direction = 1;
    public void setPosition(int row, int column){
        vertPos = row;
        horPos = column;
    }
    public int row(){
        return vertPos;
    }
    public int col(){
        return horPos;
    }
    public void setDirection(int direction){
        if(direction<=3 && direction>=0){
            this.direction = direction;
        }
    }
    public int getDirection(){
        return direction;
    }
    
    public void turnRight(){
        direction = (direction+1)%4;
    }
    public void turnLeft(){
        direction = (direction+3)%4;
    }
    public boolean checkForBricks(Yard yard) {
        int nextRow = vertPos;
        int nextCol = horPos;

        if (direction == 0) { 
            nextRow -= 1; 
        }
        else if (direction == 1) { 
            nextCol += 1; 
        } 
        else if (direction == 2) { 
            nextRow += 1; 
        } 
        else if (direction == 3) { 
            nextCol -= 1; 
        } 


        if (nextRow < 0 || nextRow >= yard.getHeight() + 2 ||nextCol < 0 || nextCol >= yard.getWidth() + 2) {
            return true; 
        }

        return yard.getValue(nextRow, nextCol) == 'R';
    }
    public void move(Yard yard){
        if (!checkForBricks(yard)){
            if(direction == 0){
                vertPos--;
            } else if(direction ==1 ){
                horPos++;
            } else if (direction == 2){
                vertPos++;
            } else if (direction == 3){
                horPos--;
            }
        }
    }
    public char getDirectionSymbol() {
        if (direction == 0) {
            return '^'; 
        } else if (direction == 1) {
            return '>'; 
        } else if (direction == 2) {
            return 'v'; 
        } else {
            return '<'; 
        }
    }
    public void mow(Yard yard){
        yard.setValue(vertPos, horPos, ' ');
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void delay(long mseconds) {
       try {
           Thread.sleep(mseconds);
       } catch (InterruptedException e) {
           System.err.println("InterruptedException received!");
       }
   }

    public static void main(String[] args) {
        clearScreen();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a height and then a width for the yard: ");
        int height=in.nextInt();
        int width = in.nextInt();
        Yard yard = new Yard(height, width);
        Mower mower = new Mower(1, 1);
        mower.getDirection();
        double height2;
        if (height%2 == 0){
            height2=height/2;
        } else {
            height2=(height/2) + 1;
        }
        for (int j =0; j<height2; j++){
        while (!mower.checkForBricks(yard)) {
            clearScreen();
            mower.mow(yard);
            yard.printLawn(mower);
            Mower.delay(1000);
    
            int oldRow = mower.row();
            int oldCol = mower.col();
            mower.move(yard);
    
            if (mower.row() == oldRow && mower.col() == oldCol) {
                break;
            }
        }
        for(int i = 0; i <=1; i++){
            clearScreen();
            mower.move(yard);
            yard.printLawn(mower);
            clearScreen();
            mower.mow(yard);
            yard.printLawn(mower);
            clearScreen();
            mower.turnRight();
            yard.printLawn(mower);
        }
        while (!mower.checkForBricks(yard)) {
            clearScreen();
            mower.mow(yard);
            yard.printLawn(mower);
            Mower.delay(1000);
    
            int oldRow = mower.row();
            int oldCol = mower.col();
            mower.move(yard);
    
            if (mower.row() == oldRow && mower.col() == oldCol) {
                break;
            }
        }
        for(int i = 0; i <=1; i++){
            clearScreen();
            mower.move(yard);
            yard.printLawn(mower);
            clearScreen();
            mower.mow(yard);
            yard.printLawn(mower);
            clearScreen();
            mower.turnLeft();
            yard.printLawn(mower);
        }

    }
}
}
