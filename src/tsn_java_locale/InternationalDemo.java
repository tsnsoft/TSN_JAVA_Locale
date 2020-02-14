package tsn_java_locale;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalDemo {

    public static void main(String[] args) throws IOException {
        String country = "", language = "";
        System.out.println("1 – Английский");
        System.out.println("2 – Казахский");
        System.out.println("3 – Белорусский");
        System.out.println("Любой другой символ – Русский");
        char i = (char) System.in.read();
        switch (i) {
            case '1':
                language = "en";
                country = "US";
                break;
            case '2':
                language = "kk";
                country = "KZ";
                break;
            case '3':
                language = "bel";
                country = "BY";
                break;
        }
        Locale userLocale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", userLocale);
        System.out.println(getStr(rb.getString("my.question"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.reply"), rb.getString("utf16")));
    }

    public static String getStr(String text, String utf16) throws UnsupportedEncodingException {
        if (!utf16.equals("true")) {
            return new String(text.getBytes("ISO-8859-1"), "Windows-1251");
        } else {
            return text;
        }
    }

}
