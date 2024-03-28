import java.time.LocalDate;

public class Calculator {
    public static String calculate(int year){
/*  algorithm invented by the mathematician Carl Friedrich Gauss in 1800
    Let y be the year (such as 1800 or 2001)
    Divide y by 19 and call the remainder a. Ignore the quotient.
    Divide y by 100 to get a quotient b and a remainder c.
    Divide b by 4 to get a quotient d and a remainder e.
    Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
    Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
    Divide c by 4 to get a quotient j and a remainder k.
    Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
    Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
    Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder.
    Divide h - m + r + n + 19 by 32 to get a remainder of p. Ignore the quotient.

    Then Easter falls on a day p of month n.*/
        int y = year;
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        LocalDate result = LocalDate.of(year, n, p);

        return String.valueOf(result);
    }
}
