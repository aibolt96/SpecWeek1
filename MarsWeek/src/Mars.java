public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Cool Mars Colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(4);

        meals = shipPopulation * 0.75;
        meals = shipPopulation * 0.75;
        System.out.println(meals);
        meals = meals + (meals * 0.50);
        System.out.println(meals);
        shipPopulation += 5;

        String landingLocation = "The Ocean";

        if (landingLocation == "The Ocean") {
            System.out.println("Bbzzz Landing on " + landingLocation);
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on " + landingLocation);
        }
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minutes = 0; minutes <= minutesLeft; minutes++) {
            if ((minutes % 2) == 0 && (minutes % 3) == 0) {
                System.out.println("Keep Center");
            } else if ((minutes % 2) == 0) {
                System.out.println("Right");
            } else if ((minutes % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Center");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}