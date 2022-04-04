public class uppg3 {
    public static void main(String[] args) {
        String vanlig = "hej, jag heter Hjalmar";

        String palin = uppg1.reverse(vanlig);

        if (vanlig.equals(palin)){
            System.out.println("Stringen: ''" + vanlig + "'' är ett palindrom");
        } else {
            System.out.println("Stringen: ''" + vanlig + "'' är inte ett palindrom");
        }
    }
}
