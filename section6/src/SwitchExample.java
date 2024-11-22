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
                String badResponse = "Invalid month"; // the yield keyword is used to return a value from a switch expression inside a lambda
                yield badResponse;
            }
        };
    }

    // NATO phonetic alphabet
    public static void getPhoneticAlphabet(char letter){
        switch(letter){
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Delta");
                break;
            case 'E':
                System.out.println("Echo");
                break;
            case 'F':
                System.out.println("Foxtrot");
                break;
            case 'G':
                System.out.println("Golf");
                break;
            case 'H':
                System.out.println("Hotel");
                break;
            case 'I':
                System.out.println("India");
                break;
            case 'J':
                System.out.println("Juliet");
                break;
            case 'K':
                System.out.println("Kilo");
                break;
            case 'L':
                System.out.println("Lima");
                break;
            case 'M':
                System.out.println("Mike");
                break;
            case 'N':
                System.out.println("November");
                break;
            case 'O':
                System.out.println("Oscar");
                break;
            case 'P':
                System.out.println("Papa");
                break;
            case 'Q':
                System.out.println("Quebec");
                break;
            case 'R':
                System.out.println("Romeo");
                break;
            case 'S':
                System.out.println("Sierra");
                break;
            case 'T':
                System.out.println("Tango");
                break;
            case 'U':
                System.out.println("Uniform");
                break;
            case 'V':
                System.out.println("Victor");
                break;
            case 'W':
                System.out.println("Whiskey");
                break;
            case 'X':
                System.out.println("X-ray");
                break;
            case 'Y':
                System.out.println("Yankee");
                break;
            case 'Z':
                System.out.println("Zulu");
                break;
            default:
                System.out.println("Invalid letter");
                break;
        }
    }
    public static String getPhoneticAlphabet2(char letter){
        return switch (letter){
            case 'A' -> "Alpha";
            case 'B' -> "Bravo";
            case 'C' -> "Charlie";
            case 'D' -> "Delta";
            case 'E' -> "Echo";
            case 'F' -> "Foxtrot";
            case 'G' -> "Golf";
            case 'H' -> "Hotel";
            case 'I' -> "India";
            case 'J' -> "Juliet";
            case 'K' -> "Kilo";
            case 'L' -> "Lima";
            case 'M' -> "Mike";
            case 'N' -> "November";
            case 'O' -> "Oscar";
            case 'P' -> "Papa";
            case 'Q' -> "Quebec";
            case 'R' -> "Romeo";
            case 'S' -> "Sierra";
            case 'T' -> "Tango";
            case 'U' -> "Uniform";
            case 'V' -> "Victor";
            case 'W' -> "Whiskey";
            case 'X' -> "X-ray";
            case 'Y' -> "Yankee";
            case 'Z' -> "Zulu";
            default -> "Invalid letter";
        };
    }
}
