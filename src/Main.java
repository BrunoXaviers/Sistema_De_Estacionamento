import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Qual a capacidade do estacionamento?");
        int capacidade = scn.nextInt();
        scn.nextLine();
        Estacionamento estacionamento = new EstacionamentoPilha(capacidade);
        int opcao = 0;
        do {
            System.out.println("1 - Guardar Carro");
            System.out.println("2 - Remover Carro");
            System.out.println("3 - Remover Carro por placa");
            System.out.println("4 - Mostrar Carros Estacionados");
            System.out.println("5 - Sair");
            opcao = scn.nextInt();
            scn.nextLine();
            switch (opcao) {
                case 1: {
                    System.out.println("Digite a placa do carro:");
                    String placa = scn.nextLine();
                    Carro carro = new Carro(placa);
                    estacionamento.guardarCarro(carro);
                    break;
                }
                case 2: {
                    Carro carroRemovido = estacionamento.removerCarro();
                    System.out.println("Carro removido: " + carroRemovido);
                    break;
                }
                case 3: {
                    System.out.println("Digite a placa do carro a ser removido:");
                    String placaRemover = scn.nextLine();
                    Carro carroRemovido = estacionamento.removerCarro(placaRemover);
                    System.out.println("Carro removido: " + carroRemovido);
                    break;
                }
                case 4:
                    estacionamento.mostrarCarros();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 5);
        scn.close();
    }
}
