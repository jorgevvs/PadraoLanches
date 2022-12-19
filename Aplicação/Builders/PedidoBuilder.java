package Aplicação.Builders;

import Common.Ingrediente;
import Common.Pedido;
import Aplicação.Estados.EstadosPedido.Disponivel;
import Aplicação.Estados.EstadosPedido.Estado;

import java.util.List;

public class PedidoBuilder {
    public Double valor;
    public List<Ingrediente> Ingredientes;
    public Estado Estado = new Disponivel() {
    };
    public boolean descontoFoiAplicado = false;
    public String Observacoes;

    public PedidoBuilder comIngrediente(Ingrediente ingrediente){
        Ingredientes.add(ingrediente);
        return this;
    }

    public PedidoBuilder comObservacoes(String observacoes){
        Observacoes = observacoes;
        return this;
    }

    public Pedido Finaliza(){
        return new Pedido(valor, Ingredientes, Estado, false,Observacoes);
    }
}
