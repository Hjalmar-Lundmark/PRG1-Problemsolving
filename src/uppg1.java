import javax.swing.*;

public class uppg1 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Skriv vad du vill ha baklänges");

        String r = reverse(s);
        System.out.println(r);
    }

    public static String reverse(String s) {
        String re = "";
        int c = s.length();
        for (int i = 0; i < s.length(); i++){
            c -= 1;
            re += s.charAt(c);
        }
        return re;
    }
}
