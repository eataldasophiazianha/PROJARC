public class App {
    public static void main(String[] args) throws Exception {

        Basico basico = new Basico("Basico");
        Exportivo exportivo = new Exportivo("Exportivo");
        Utilitario utilitario = new Utilitario("Utilitario");
         
        basico.PrintStats();
        exportivo.PrintStats();
        utilitario.PrintStats();

    }
}