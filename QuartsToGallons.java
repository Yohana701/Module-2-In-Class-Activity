public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLONS = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded/ QUARTS_IN_GALLONS;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLONS;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallon plus " + extraQuartsNeeded+ " quarts.");
    }
}

