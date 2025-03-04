package AO1;

import InClass.App;

public class Demo extends Application{
    public Demo(String title){
        super(title);
    }
    public static void main(String[] args) {
        Application app = new Application("Demo Window");
        app.setVisible(true);
    }
}
