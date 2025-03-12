
public class Basico extends Carro {
    public Basico(String modelo) {
        super("Basico", TipoCombustivel.GASOLINA, 10, 55);
    }

    public void PrintStats() {
        Basico basico = new Basico("Basico");

        System.out.println("\n\n----------------");

        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);

        System.out.println("\n\n----------------");

        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);

        System.out.println(basico);

    }

}
