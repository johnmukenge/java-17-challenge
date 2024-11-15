public class OverloadingChallenge {

    /*
    * Create two methods with the same name: convertToCentimeters.
    The first method has one parameter of type int, which represents
    * the entire height in inches. You'll convert inches to centimeters,
    * in this method, and pass back the number of centimeters, as a double.
    The second method has two parameters of type int, one to represent height in feet,
    * and one to represent the remaining height in inches. So if a person is 5 foot,
    * 8 inches, the values 5 for feet and 8 for inches would be passed to this method.
    * This method will convert feet and inches to just inches, then call the first method,
    * to get the number of centimeters, also returning the value as a double.
    * Both methods should return a real number or decimal value for total height in centimeters.
    Call both methods, and print out the results.
    The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
    Also, remember one foot = 12 inches.
    You can use the link below to test your results:
    https://www.metric-conversions.org/length/feet-to-centimeters.htm
* */

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        // heightInFeet represents height in feet
        // heightInInches represents the remaining height in inches
        int totalInches = heightInFeet * 12 + heightInInches;
        return convertToCentimeters(totalInches);
    }

    /*
    * In this challenge, we're going to create a method, that takes time, represented in seconds, as the parameter.
        We'll then want to transform the seconds into hours.
        Next, you'll display the time in hours with the remaining minutes and seconds in a String.
        We'll do this transformation in two steps, which allows us to use overloaded methods.
        *
        * We want to create two methods with the same name:  getDurationString
        The first method has one parameter of type int, named seconds.
        The second method has two parameters, named minutes and seconds, both ints.
        Both methods return a String in the format shown:‘XXh YYm ZZs’where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
        The first method should in turn call the second method to return its results.
        *
        * Make both methods public and static as we've been doing so far in this course.
        Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.
        Start by creating a new project, and call it SecondsAndMinutesChallenge.
        *
        * Add validation to the methods as a bonus:
        For the first method, the seconds parameter should be  >= 0.
        For the second method, the minutes parameter should be >= 0, and the seconds parameter should be >= 0, and <= 59.
        If either method is passed an invalid value, print out some type of meaningful message to the user.
*/

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive value";
        }
        return getDurationString(seconds/60, seconds % 60);

    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if(seconds < 0 || seconds > 59){
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    // Bonus challenge
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return radius * radius * 3.14;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x*y;
    }

    // Years and days
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
        }
        long hours = minutes/60;
        int days = (int) hours/24;
        System.out.println(minutes + " = "+ days/365 + " y and " + days % 365 + " d");
    }

    public static void printEqual(int one, int two, int three){
        if(one < 0 || two < 0 || three < 0){
            System.out.println("Invalid Value");
        } else if((one == two) && (two == three)){
            System.out.println("All numbers are equal");
        } else if((one != two) && (two != three) && (one != three)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature >= 25 && temperature <= 45){
            return true;
        } else return !summer && temperature >= 25 && temperature <= 35;
    }
}
