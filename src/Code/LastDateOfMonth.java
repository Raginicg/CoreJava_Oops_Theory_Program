package Code;
import java.time.YearMonth;
import java.util.Scanner;

public class LastDateOfMonth {

    enum MonthEnum {
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4),
        MAY(5), JUNE(6), JULY(7), AUGUST(8),
        SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

        private final int value;

        MonthEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static MonthEnum fromName(String name) {
            for (MonthEnum m : MonthEnum.values()) {
                if (m.name().equalsIgnoreCase(name)) {
                    return m;
                }
            }
            throw new IllegalArgumentException("Invalid month name: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month name: ");
        String monthInput = sc.nextLine().toUpperCase();

        try {
            MonthEnum monthEnum = MonthEnum.fromName(monthInput);
            YearMonth yearMonth = YearMonth.of(2025, monthEnum.getValue());
            System.out.println("Last date: " + yearMonth.atEndOfMonth());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
     }
    }
}
