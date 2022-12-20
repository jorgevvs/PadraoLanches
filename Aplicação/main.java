package Aplicação;

import Aplicação.Builders.PedidoBuilder;
import Common.Ingrediente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        List<Ingrediente> EstoqueDisponivel = AbastecerEstoque();
        MenuPrincipal(EstoqueDisponivel);
    }
    public static void MenuPrincipal(List<Ingrediente> estoque){
        Scanner in = new Scanner(System.in);
        System.out.println("========== Padrão Lanches ==========");
        System.out.println("Gostaria de realizar um novo pedido?");
        System.out.println("====================================");
        System.out.println("     1 - Sim            2- Não");
        System.out.println("====================================");
        System.out.print("Digite: ");
        int resposta = Integer.parseInt(in.nextLine());

        if(resposta == 1){
            NovoPedido(estoque);
        }
    }



    public static void NovoPedido(List<Ingrediente> estoque){
        PedidoBuilder CriadorDePedido = PedidoBuilder.getInstancia();
    }

    public static List<Ingrediente> AbastecerEstoque() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Cebola", 0.50));
        ingredientes.add(new Ingrediente("Picles", 1.00));
        ingredientes.add(new Ingrediente("Cheddar", 2.00));
        ingredientes.add(new Ingrediente("Batata Palha", 1.50));
        ingredientes.add(new Ingrediente("Ovo de Codorna", 2.50));
        ingredientes.add(new Ingrediente("Calabresa", 2.50));
        ingredientes.add(new Ingrediente("Catupiry", 2.00));
        ingredientes.add(new Ingrediente("Presunto", 1.00));
        ingredientes.add(new Ingrediente("Molhos", 0.50));
        ingredientes.add(new Ingrediente("Carne", 5.00));
        ingredientes.add(new Ingrediente("Frango", 4.00));
        return ingredientes;
    }
}