import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(" ");
            System.out.println("Hello, what a weather today?");

            boolean hisRaining = answerRain();
            boolean hisSunny = answerSunny();

            if (hisRaining && !hisSunny) {
                System.out.println("Today is Raining day");
            }
             if (hisRaining && hisSunny) {
                System.out.println("Today is Rainbow");
            }
            if (hisSunny && !hisRaining) {
                System.out.println("Today is Sunny day");
            }
            if (!hisSunny && !hisRaining) {
                System.out.println("Today is Cloudy");
            }
        }
    }

    public static boolean answerSunny(){
        boolean hisSunny;
        System.out.println("You are have sunny?");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.next();
        boolean isPositive = userResponse.equalsIgnoreCase("Yes");
         if (isPositive) {
             hisSunny = true;
         } else{
             hisSunny = false;
         }
         return hisSunny;
    }

    public static  boolean answerRain(){
        boolean hisRaining;
        System.out.println("You are have rain?");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        Boolean isPositive = userAnswer.equalsIgnoreCase("Yes");

        if(isPositive){
            hisRaining = true;
        } else{
            hisRaining = false;
        }
        return hisRaining;
    }
}
