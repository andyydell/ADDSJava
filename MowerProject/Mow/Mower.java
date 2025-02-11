package MowerProject.Mow;
import MowerProject.Mow.Yard;
import java.util.Scanner;
import java.util.Random;
public class Mower{
    private int vertPos;
    private int horPos;
    private int direction;
    public Mower(int vert, int hor, int dir){
        vertPos = vert;
        horPos = hor;
        direction = dir;
    }
    
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
   public static int positionMowerHeight(Yard yard){
        Random rng= new Random();
        int co = rng.nextInt(2);
        if (co == 1){
            return yard.getHeight();
        } else {
            return 1;
        }
   }
   public static int positionMowerWidth(Yard yard){
        Random rng= new Random();
        int co = rng.nextInt(2);
        if (co == 1){
            return yard.getWidth();
        } else {
            return 1;
        }
   }
   public static int positionMowerDirection(){
        Random rng = new Random();
        int dir = rng.nextInt(4);
        return dir;
   }
   private void moveTo(int row, int col, Yard yard){
        while (vertPos != row || horPos != col) {
        if (vertPos < row) { 
            setDirection(2); 
            move(yard);
        } else if (vertPos > row) { 
            setDirection(0); 
            move(yard);
        } else if (horPos < col) { 
            setDirection(1); 
            move(yard);
        } else if (horPos > col) { 
            setDirection(3);
            move(yard);
        }
    }
   }
   public boolean updateMower(Yard yard){
        for (int i = 1; i <= yard.getHeight(); i++) {
        for (int j = 1; j <= yard.getWidth(); j++) {
            if (yard.getValue(i, j) == '+') { 
                if (vertPos < i) { 
                    setDirection(2); 
                    move(yard);
                } else if (vertPos > i) { 
                    setDirection(0); 
                    move(yard);
                } else if (horPos < j) { 
                    setDirection(1); 
                    move(yard);
                } else if (horPos > j) { 
                    setDirection(3); 
                    move(yard);
                }
                
                return true; 
            }
        }
    }
    return false; 
   }


    public static void main(String[] args) {
        clearScreen();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a height and then a width for the yard: ");
        int height=in.nextInt();
        int width = in.nextInt();
        Yard yard = new Yard(height, width);
        int randomRow = positionMowerHeight(yard);
        int randomCol = positionMowerWidth(yard);
        int randomDir = positionMowerDirection();
        Mower mower = new Mower(randomRow, randomCol, randomDir);
        yard.printLawn(mower);
        mower.mow(yard);
        delay(1000);
        while (mower.updateMower(yard)) {  
            Mower.clearScreen();           
            mower.mow(yard);              
            yard.printLawn(mower);         
            Mower.delay(500);              
        } 
            
        //Below here is for part B i.e. less efficient
        /* 
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
        */
}
}
