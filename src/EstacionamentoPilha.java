import java.util.Objects;
import java.util.Stack;

public class EstacionamentoPilha implements Estacionamento{

    public Stack<Carro> carrosEstacionados;
    public int capacidadeMaxima;
    public EstacionamentoPilha(int capacidadeMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
        carrosEstacionados = new Stack<Carro>();
    }

    public void guardarCarro(Carro carro){
        if(estaCheio()){
            System.out.println("Estacionamento cheio! Não é possível guardar o carro.");
            return;
        }
        carrosEstacionados.push(carro);
    }

    public Carro removerCarro(){
        if(estaVazio()){
            System.out.println("Estacionamento vazio! Não há carros para remover.");
            return null;
        }
        return carrosEstacionados.pop();
    }

    public Carro removerCarro(String placa){
        Stack<Carro> temp = new Stack<>();
        Carro carroRemovido = null;
        while(!carrosEstacionados.isEmpty()){
            Carro carroAtual = carrosEstacionados.pop();
            if(Objects.equals(carroAtual.placa, placa)){
                carroRemovido = carroAtual;
                break;
            }
            else{
                temp.push(carroAtual);
            }
        }

        while(!temp.isEmpty()){
            carrosEstacionados.push(temp.pop());
        }

        return carroRemovido;
    }

    public void mostrarCarros(){
        for(Carro carro : carrosEstacionados){
            System.out.println(carro);
        }
    }

    public boolean estaCheio(){
        return carrosEstacionados.size() == capacidadeMaxima;
    }

    public boolean estaVazio(){
        return carrosEstacionados.isEmpty();
    }

}
