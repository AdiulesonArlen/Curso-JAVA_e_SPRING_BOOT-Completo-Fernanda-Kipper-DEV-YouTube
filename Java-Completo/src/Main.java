public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        char c = 'A';
        boolean bool = true;
        String str = "Austin";

        int colecaoDeInteiros[] = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[5];

        if (str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if ( str == "Austin") {
        System.out.println("Austin");
        } else {
            System.out.println("Falso!");
        }

        System.out.println(colecaoDeInteiros[0]);
        System.out.println(colecaoDeInteiros.length);
    }
}