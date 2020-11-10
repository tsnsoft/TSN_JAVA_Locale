package tsn_java_locale;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru", "KZ"));
        Locale current = Locale.getDefault();

        System.out.println(current.getCountry()); // KZ
        System.out.println(current.getDisplayCountry()); // Казахстан
        System.out.println(current.getLanguage()); // ru
        System.out.println(current.getDisplayLanguage()); // русский
        System.out.println();

        Locale[] locales = new Locale[]{Locale.JAPAN, Locale.CHINA, Locale.KOREA, Locale.TAIWAN, Locale.ITALY,
            Locale.FRANCE, Locale.GERMAN, Locale.CANADA, Locale.ENGLISH, new Locale("ru", "RU"), new Locale("ru"),
            new Locale("kk", "KZ")};

        for (Locale locale : locales) {
            NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
            System.out.println(locale.getDisplayName() + " = " + numberFormat.format(1234.5678) + "   "
                    + currencyFormat.format(-123.456) + " = " + percentFormat.format(0.1456));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Long date format in " + locale.toString() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Long time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

    }
}
