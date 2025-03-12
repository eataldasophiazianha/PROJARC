public class Exportivo extends Carro {
    public Exportivo(String modelo) {
        super("Exportivo", TipoCombustivel.GASOLINA, 6, 45);
    }

    public void PrintStats () {
        Exportivo exportivo = new Exportivo("Exportivo");

        System.out.println("\n\n----------------");

        System.out.println("\nAbastencendo carro exportivo com gasolina");
        exportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(exportivo);

        System.out.println("\n\n----------------");

        System.out.println("\nViajando com o carro exportivo");
        exportivo.viaja(250);
        exportivo.viaja(150);

        System.out.println(exportivo);

    }
        
}
