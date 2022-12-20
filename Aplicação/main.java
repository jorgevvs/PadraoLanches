package Aplicação;

import Aplicação.Builders.PedidoBuilder;
import Common.Ingrediente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        List<Ingrediente> EstoqueDisponivel = MenuPrincipal.AbastecerEstoque();
        MenuPrincipal.MenuPrincipal(EstoqueDisponivel);
        System.out.print("Obrigado e Volte Sempre!");
    }
}