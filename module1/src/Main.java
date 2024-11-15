public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Inches to centimeters " + OverloadingChallenge.convertToCentimeters(10));
        System.out.println("Feet and inches to centimeters " + OverloadingChallenge.convertToCentimeters(5, 8));

        // Second and minutes challenge
        System.out.println("Duration string " + OverloadingChallenge.getDurationString(-3945));
        System.out.println("Duration string " + OverloadingChallenge.getDurationString(-65, 45));
        System.out.println("Duration string " + OverloadingChallenge.getDurationString(65, 145));
        System.out.println("Duration string " + OverloadingChallenge.getDurationString(65, 45));
        System.out.println("Duration string " + OverloadingChallenge.getDurationString(3945));

        // Bonus challenge
        System.out.println("Circle area " + OverloadingChallenge.area(5));
        System.out.println("Rectangle area " + OverloadingChallenge.area(4,3));

        // Years and days
        OverloadingChallenge.printYearsAndDays(561600);

        OverloadingChallenge.printEqual(1,2,3);

        System.out.println("Is the cat playing? " + OverloadingChallenge.isCatPlaying(false, 35));


    }
}