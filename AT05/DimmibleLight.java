package AT05;
import java.util.Scanner;
class DimmibleLight {
  int lightGrade = 0;
  boolean onOff = false;
  public void dimLight(){
    //Establishes the function of lowering the light level
    //This function does not work if the light is off
    if (onOff == true){
      lightGrade = lightGrade - 1;
      } else { lightGrade = lightGrade;}
  }
  public void brightenLight(){
     //Establishes the function of raising the light level
    //This function does not work if the light is off
    if (onOff == true){
    lightGrade = lightGrade + 1;
    } else { lightGrade = lightGrade;}
  }
  public void turnOn() {
    //Establishes turning on the light
    //Sets the light grade to the lowest level
    onOff = true;
    lightGrade = 1;
  }
  public void turnOff() {
    //Turns of the light
    //Sets light to 0
    onOff = false;
    lightGrade = 0;
  }
  public int view() {
    return lightGrade;
  }
  public boolean viewStatus() {
    return onOff;
  }
  public static void main(String[] args) {
    DimmibleLight dlight = new DimmibleLight();
    Scanner in = new Scanner(System.in);
    String response = "";
    int i = 1;
    while (i == 1) {
      System.out.print("Enter what you would like to heppen to the light or enter q to quit: ");
      response = in.nextLine();
      if (response.toUpperCase().compareTo("ON") == 0){
        dlight.turnOn();
      } else if (response.toUpperCase().compareTo("OFF") == 0) {
        dlight.turnOff();
      } else if (response.toUpperCase().compareTo("UP") == 0) {
        dlight.brightenLight();
      } else if (response.toUpperCase().compareTo("DOWN") == 0){
        dlight.dimLight();
      } else if (response.toUpperCase().compareTo("VIEW") == 0){
        System.out.println("True/False, the light is on: " + dlight.viewStatus() +". And the light level is " + dlight.view());
      } else if (response.toUpperCase().compareTo("Q") == 0) {
        i = i+1;
        System.out.println("Thank You!");
      }else {
        System.out.println("Error. Enter either on, off, up, down, view, or q");
      }
    }
  }
  
  
}
