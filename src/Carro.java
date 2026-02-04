public class Carro {
    public String placa;
    public Carro(String placa) {
        this.placa = placa;
    }
    @Override
    public String toString() {
        return "Placa: " + placa;
    }
}
