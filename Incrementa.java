public class Incrementa
{
    public static void incrementa() {
        System.out.println("Vamos incrementar em 1 e 1");
        // Usando incremento ctd = ctd + 1
        for (int ctd = 1; ctd <= 10; ctd = ctd + 1) {
            System.out.println("ctd = ctd + 1: " + ctd);
        }
        // Usando incremento ctd += 1
        for (int ctd = 1; ctd <= 10; ctd += 1) {
            System.out.println("ctd += 1: " + ctd);
        }
        // Usando incremento ctd ++
        for (int ctd = 1; ctd <= 10; ctd ++) {
            System.out.println("ctd ++: " + ctd);
        } 
    }
}
