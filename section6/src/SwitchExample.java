public class SwitchExample {

    /*
    Switch values types (Primitives): byte, short, char, int
    Byte, Short, Character and Integer
    String, Enum
    * */
    public static void getTheValue(int value){
        switch (value){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The value is one of 3, 4 or 5");
                System.out.println("Actually, the value is " + value);
                break;
            default:
                System.out.println("The value is neither 1, 2, 3, 4 nor 5");
                break;
        }
    }
}
