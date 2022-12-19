package Aplicação;

import Aplicação.Builders.PedidoBuilder;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        MenuPrincipal();
    }
    public static void MenuPrincipal(){
        Scanner in = new Scanner(System.in);
        System.out.println("========== Padrão Lanches ==========");
        System.out.println("Gostaria de realizar um novo pedido?");
        System.out.println("====================================");
        System.out.println("     1 - Sim            2- Não");
        System.out.println("====================================");
        System.out.print("Digite: ");
        int resposta = Integer.parseInt(in.nextLine());

        if(resposta == 1){
            NovoPedido();
        }
    }


    public static void NovoPedido(){
        PedidoBuilder CriadorDePedido = new PedidoBuilder();

    }

}
