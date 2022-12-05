package Common;

import AplicaDescontos.AplicadorDeDescontos;
import Common.Ingrediente;

import java.util.List;
import EstadosPedido.Estado;

public class Pedido {
    public Double valor;
    public List<Ingrediente> Ingredientes;
    public Estado Estado;
    public boolean descontoFoiAplicado = false;

    public void aplicaDesconto(){
        descontoFoiAplicado = true;
        AplicadorDeDescontos aplicador = new AplicadorDeDescontos();
        this.valor = aplicador.DevolveDesconto(this);
    }

    public boolean getDescontoFoiAplicado(){
        return descontoFoiAplicado;
    }

    public void setEstado(EstadosPedido.Estado estado) {
        Estado = estado;
    }

    public EstadosPedido.Estado getEstado() {
        return Estado;
    }

    public List<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public Double getValor() {
        return valor;
    }
}
