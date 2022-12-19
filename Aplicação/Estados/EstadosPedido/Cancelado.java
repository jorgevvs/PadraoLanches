package Aplicação.Estados.EstadosPedido;

import Common.Pedido;

public class Cancelado implements Estado{
    @Override
    public void AplicarDescontoExtra(Pedido pedido) throws Exception {
        throw new Exception("O pedido foi cancelado!");
    }
    @Override
    public void Produzir(Pedido pedido) throws Exception {
        throw new Exception("O pedido foi cancelado!");
    }
    @Override
    public void Cancelar(Pedido pedido) throws Exception {
        throw new Exception("O pedido foi cancelado!");
    }
    @Override
    public void Finalizar(Pedido pedido) throws Exception {
        throw new Exception("O peido foi cancelado!");
    }
}
