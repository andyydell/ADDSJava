//package HwN02;
public class Input {
     public static void main(String[] args) {
        System.out.printf("%d arguments provided.%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argument #%02d: %s%n", i + 1, args[i]);
        }
    }
}
