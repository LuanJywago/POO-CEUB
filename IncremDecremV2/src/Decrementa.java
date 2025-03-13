public class Decrementa
{
    public static void decrementa() {
        System.out.println("Vamos decrementar em 1 e 1");
        // Usando decremento ctd = ctd - 1
        for (int ctd = 10; ctd >= 1; ctd = ctd - 1) {
            System.out.println("ctd = ctd - 1: " + ctd);
        }
        // Usando decremento ctd -= 1
        for (int ctd = 10; ctd >= 1; ctd -= 1) {
            System.out.println("ctd -= 1: " + ctd);
        }
        // Usando decremento ctd --
        for (int ctd = 10; ctd >= 1; ctd --) {
            System.out.println("ctd --: " + ctd);
        }         
    }
}