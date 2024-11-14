public class PrimeNumber {

    public static void isPrimeNumber ( int number){

        if (number >1 && number %1==0 && number %number ==0){
            System.out.println(number + " is a prime number ");
        }
        else {
            System.out.println(number + " is not a prime number ");
        }
    }
}
