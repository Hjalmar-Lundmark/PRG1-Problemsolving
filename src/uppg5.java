public class uppg5 {
    public static void main(String[] args) {
        //Uppgift 2 i Problemlösing matematik del 1
        int prim;
        int antal = 0;

        for (int i = 0; antal < 100; i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) {      //Jag måste nog hård-koda att de printar alla som jag delar med och fortsätta kedjan
                prim = i;
                antal++;
                System.out.println("Primtal nummer " + antal + ": " + prim);
            }

        }

    }
}
