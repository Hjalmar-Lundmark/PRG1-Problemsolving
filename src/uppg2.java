import java.util.Locale;

public class uppg2 {
    public static void main(String[] args) {
        String s = "mitt förnamn och efternamn";        //Reminder: gör att första bokstaven alltid blir liten bokstav oavsett om den är stor eller liten.

        String camel = camelCase(s);
        System.out.println(camel);
    }

    public static String camelCase(String s) {
        String c = "";
        char v;
        String sb;
        for (int i = 0; i < s.length(); i++){
            v = s.charAt(i);
            if (v == ' ') {
                v = s.charAt(i+1);
                sb = String.valueOf(v);
                sb = sb.toUpperCase(Locale.ROOT);
                c += sb;
                i++;
            } else {
                c += v;
            }
        }
        return c;
    }
}
