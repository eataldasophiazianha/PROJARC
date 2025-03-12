public class App {
    public static void main(String[] args) throws Exception {

        Basico basico = new Basico("Basico");
         basico.PrintStats();

        System.out.println("\n\n----------------");

        Exportivo exportivo = new Exportivo("Exportivo");


        exportivo.PrintStats();

        System.out.println("\n\n----------------");
    }
}