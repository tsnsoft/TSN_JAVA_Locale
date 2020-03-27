package tsn_java_locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo_micro {

    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);
        Locale currentLocale = Locale.getDefault();
        ResourceBundle lang = ResourceBundle.getBundle("lang", currentLocale);

        Date dt = new Date();
        
        System.out.println(currentLocale.getCountry()); // DE
        System.out.println(currentLocale.getDisplayCountry()); // Deutschland
        System.out.println(currentLocale.getLanguage()); // de
        System.out.println(currentLocale.getDisplayLanguage()); // Deutsch

        NumberFormat nf = NumberFormat.getNumberInstance(currentLocale); // 1.234,568
        NumberFormat cf = NumberFormat.getCurrencyInstance(currentLocale); // -123,46 €
        NumberFormat pf = NumberFormat.getPercentInstance(currentLocale); // 15%
        DateFormat df1 = SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT); // 27.03.20
        DateFormat df2 = SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG); // 27. März 2020
        DateFormat df3 = SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL); // Freitag, 27. März 2020
        DateFormat dt1 = SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT); // 13:31
        DateFormat dt2 = SimpleDateFormat.getTimeInstance(SimpleDateFormat.LONG); // 13:31:26 ALMT
        DateFormat dt3 = SimpleDateFormat.getTimeInstance(SimpleDateFormat.FULL); // 13:31 Uhr ALMT

        System.out.println(nf.format(1234.5678));
        System.out.println(cf.format(-123.456));
        System.out.println(pf.format(0.1456));
        System.out.println(df1.format(dt));
        System.out.println(df2.format(dt));
        System.out.println(df3.format(dt));
        System.out.println(dt1.format(dt));
        System.out.println(dt2.format(dt));
        System.out.println(dt3.format(dt));

        System.out.println(lang.getString("my.question")); // Sein oder nicht sein?
        System.out.println(lang.getString("my.reply")); // Dies ist eine ewige Frage. Viel Glück
    }
}
