import javax.swing.*;

public class uppg4 {
    public static void main(String[] args) {
        //Uppgift 1 i Problemlösning matematik del 1
        String Ns = JOptionPane.showInputDialog(null, "Vilket siffra är N?");
        int N = Integer.parseInt(Ns);
        int sum = 0;

        for (int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
