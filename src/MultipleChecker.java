public class MultipleChecker {

    public static  void checkMultiple (int number){

        if ( number % 3 == 0 ){
            System.out.println("Fizz");
        } ;

        if (number% 5 == 0 ){
            System.out.println("Buzz");
        } ;

        if (number %3==0 && number%5==0){
            System.out.println("FizzBuzz");
        }

    }
}
