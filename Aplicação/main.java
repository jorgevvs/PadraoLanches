package Aplicação;

import Aplicação.Builders.PedidoBuilder;
import Aplicação.Estados.EstadosPedido.Disponivel;
import Common.Ingrediente;
import Common.Pedido;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        PedidoBuilder builder = PedidoBuilder.getInstancia();
        Pedido pedido = builder.comIngrediente(new Ingrediente("", 1.0))
                .comObservacoes("")
                .Finaliza();

        pedido.getEstado().Produzir(pedido);
        System.out.println(pedido.getEstado());
        pedido.getEstado().Finalizar(pedido);
        System.out.println(pedido.getEstado());
        pedido.getEstado().Cancelar(pedido);
        System.out.println(pedido.getEstado());

        System.out.println(pedido.Valor);

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

    }

}
