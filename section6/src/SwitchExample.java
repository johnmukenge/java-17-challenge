public class SwitchExample {

    /*
    Switch values types (Primitives): byte, short, char, int
    Byte, Short, Character and Integer
    String, Enum
    * */
    public static void getTheValue(int value){
        switch (value){
            case 1 -> System.out.println("The value is 1");
            case 2 -> System.out.println("The value is 2");
            case 3, 4, 5 -> {
                System.out.println("The value is one of 3, 4 or 5");
                System.out.println("Actually, the value is " + value);
            }
            default -> System.out.println("The value is neither 1, 2, 3, 4 nor 5");
        }
    }

    public static String getQuarter(String month){
        /*switch (month){
            case "January", "February", "March":
                return month + " is int the first quarter";
            case "April", "May", "June":
                return month + " is int the second quarter";
            case "July", "August", "September":
                return month + " is int the third quarter";
            case "October", "November", "December":
                return month + " is int the fourth quarter";
            default:
                return "Invalid month";
        }*/
        // Enhanced switch
        return switch (month) {
            case "January", "February", "March" -> "First quarter";
            case "April", "May", "June" -> "Second quarter";
            case "July", "August", "September" -> "Third quarter";
            case "October", "November", "December" -> "Fourth quarter";
            default -> {
                yield "Invalid month"; // the yield keyword is used to return a value from a switch expression inside a lambda
            }
        };
    }
}
