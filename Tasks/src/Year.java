import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.Необходимо вписать все года на 20 лет вперед и назад  коллекцию
2.необходимо дать возможность пользователю ввести год который он хочет проверить
3.Выполнить проверку существует ли такой год в коллекций, если да- вернуть значение его дней
4.Проверить является ли этот год выскосным
5.Вывести результат на экран
 */
public class Year {
    public static void main(String[] args) {
        Map<Integer, Integer> daysInYear = new HashMap<>();
        for (int year = 1980; year <= 2043; year++) {
            int days = isLeapYear(year) ? 366 : 365;
            daysInYear.put(year, days);
        }
        //showCollection(daysInYear);
        int answerUser = enterYear();
        int checkAnswer = checkYear(daysInYear,answerUser);


        if (isLeapYear(checkAnswer)){
            System.out.println("The " + answerUser + " is leap Year");
        } else {
            System.out.println("The " + answerUser + " is not leap Year");

        }

    }

    private static boolean isLeapYear(int year) {
        return  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static int enterYear() {
        System.out.println("Please enter a year: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int checkYear(Map<Integer, Integer> daysInYear, int answerUser) {
        if (daysInYear.containsKey(answerUser)) {
           return daysInYear.get(answerUser);
        } else {
            System.out.println("No data for the specified year.");
        }
        return -1;
    }

    private static void showCollection(Map<Integer, Integer> daysInYear){
        for (Map.Entry<Integer, Integer> entry : daysInYear.entrySet()) {
            int year = entry.getKey();
            int days = entry.getValue();
            System.out.println("Year: " + year + ", Days: " + days);
        }

    }
}


