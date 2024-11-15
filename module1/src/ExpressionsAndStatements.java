public class ExpressionsAndStatements {

    public static void isPair(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is pair");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void isGreaterOrLess(int number1, int number2){
        if (number1 > number2) {
            System.out.println("Il primo numero è maggiore.");
        } else if (number1 < number2) {
            System.out.println("Il secondo numero è maggiore.");
        } else {
            System.out.println("I numeri sono uguali.");
        }
    }

    public static void examGrade(int grade){
        if(grade <= 100 && grade >= 90){
            System.out.println("Excellent");
        } else if(grade <= 89 && grade >= 70){
            System.out.println("Bon");
        } else if(grade <= 69 && grade >= 50){
            System.out.println("Suffisant");
        } else if(grade < 50){
            System.out.println("Insuffisant");
        } else {
            System.out.println("Grade invalid");
        }
    }

    public static boolean isBissextile(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void isPrimeNumber(int number){
        if (number > 1 && number % 1 == 0 && number % number == 0){
            System.out.println(number + " is a primer number ");
        } else {
            System.out.println(number + " is not a primer number ");
        }
    }

    public static void threeAndFiveMultiple(int number){
        if(number > 0 && number % 3 == 0 && number % 5 == 0){
            System.out.println("FIZZBUZZ");
        } else if(number > 0 && number % 3 == 0){
            System.out.println("FIZZ");
        } else if( number > 0 && number % 5 == 0){
            System.out.println("BUZZ");
        } else {
            System.out.println(number);
        }
    }
}
