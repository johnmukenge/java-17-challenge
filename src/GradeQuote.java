public class GradeQuote {

    public static void getExamMention (int grade){

        if (grade >= 90 && grade <=100){
            System.out.println("Excellent");
        } else if (grade >= 70 && grade <=89 ){
            System.out.println("Bon");
        } else if (grade >=50 && grade <= 69){
            System.out.println("Suffisant");
        } else {
            System.out.println("Insuffisant");
        }
    }
}
