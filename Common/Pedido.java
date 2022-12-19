package Common;

import Aplicação.AplicaDescontos.AplicadorDeDescontos;

import java.util.List;
import Aplicação.Estados.EstadosPedido.Estado;

public class Pedido {
    public Double Valor;
    public List<Ingrediente> Ingredientes;
    public Estado Estado;
    public boolean descontoFoiAplicado = false;

    public String Observacoes;

    public Pedido(double valor, List<Ingrediente> lista, Estado estado, boolean desconto, String observacoes)
    {
        Valor = valor;
        Estado = estado;
        Ingredientes = lista;
        descontoFoiAplicado = desconto;
        Observacoes = observacoes;
    }


    public void aplicaDesconto(){
        descontoFoiAplicado = true;
        AplicadorDeDescontos aplicador = new AplicadorDeDescontos();
        this.Valor = aplicador.DevolveDesconto(this);
    }

    public boolean getDescontoFoiAplicado(){
        return descontoFoiAplicado;
    }

    public void setEstado(Aplicação.Estados.EstadosPedido.Estado estado) {
        Estado = estado;
    }

    public Aplicação.Estados.EstadosPedido.Estado getEstado() {
        return Estado;
    }

    public List<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public Double getValor() {
        return Valor;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setValor(Double valor) {
        this.Valor = valor;
    }

    public void setDescontoFoiAplicado(boolean descontoFoiAplicado) {
        this.descontoFoiAplicado = descontoFoiAplicado;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        Ingredientes = ingredientes;
    }

    public void setObservacoes(String observacoes) {
        Observacoes = observacoes;
    }
}
