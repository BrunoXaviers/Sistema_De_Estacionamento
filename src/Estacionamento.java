public interface Estacionamento {
    void guardarCarro(Carro carro);
    void mostrarCarros();
    Carro removerCarro();
    Carro removerCarro(String placa);
    boolean estaCheio();
    boolean estaVazio();
}
