
public class SwiftDate {

    int year;
    int month;
    int day;

    public SwiftDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0))) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    int getCentury(int year) {
        return (year / 100) + 1;
    }

    private int switchCase(int input) {
        int sumMonths = 0;
        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                sumMonths = sumMonths + 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                sumMonths = sumMonths + 30;
                break;
            case 2:
                if (isLeapYear(this.year) == true) {
                    sumMonths = sumMonths + 29;
                } else {
                    sumMonths = sumMonths + 28;
                }
                break;

            default:
                break;
        }
        return sumMonths;
    }

    int getDaysDifference(SwiftDate other) {
        int yearsDiff = 0;
        int copyThisYear = this.year;
        for (int i = this.year + 1; i < other.year; i++) {
            if (isLeapYear(copyThisYear) == true) {
                yearsDiff = yearsDiff + 366;
            } else {
                yearsDiff = yearsDiff + 365;
            }
            copyThisYear++;
        }
        int copyThisMonth = this.month + 1;
        int monthDiff = 0;
        if (this.year == other.year) {
            for (int i = this.month + 1; i < other.month; i++) {
                monthDiff = monthDiff + switchCase(copyThisMonth);
                copyThisMonth++;
            }
        } else {
            for (int i = this.month + 1; i <= 12; i++) {
                monthDiff = monthDiff + switchCase(copyThisMonth);
                copyThisMonth++;
            }
            for (int i = 1; i < other.month; i++) {
                monthDiff = monthDiff + switchCase(i);
            }
        }
        int dayDiff = 0;
        dayDiff = dayDiff + switchCase(this.month) - this.day;
        dayDiff = dayDiff + other.day;
        int daysDifference = yearsDiff + monthDiff + dayDiff;

        return daysDifference;
    }

    void printInfo() {
        if (isLeapYear(year) == true) {
            System.out.printf("%d %d %d - %d century. It's leap year", year, month, day, getCentury(year));
            System.out.println();
        } else {
            System.out.printf("%d %d %d - %d century.", year, month, day, getCentury(year));
            System.out.println();
        }

    }
}
