import java.util.Scanner;
class QuartsToGallonsInteractive{
    public static void main(String[] args){
        final int QUARTS_IN_GALLONS = 4;
        int quartsNeeded;
        int gallonsNeeded;
        int extraQuartsNeeded;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter quarts needed >>");
            quartsNeeded = input.nextInt();
        }
        gallonsNeeded = quartsNeeded/ QUARTS_IN_GALLONS;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLONS;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts. ");
        
    }
}
