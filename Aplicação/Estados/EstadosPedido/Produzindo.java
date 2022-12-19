package Aplicação.Estados.EstadosPedido;

import Common.Pedido;

public class Produzindo implements Estado{
    @Override
    public void AplicarDescontoExtra(Pedido pedido) throws Exception {
        throw new Exception("O pedido já está em produção, não é possível aplicar descontos!");
    }
    @Override
    public void Produzir(Pedido pedido) throws Exception {
        throw new Exception("O pedido já está em produção!");
    }
    @Override
    public void Cancelar(Pedido pedido) throws Exception {
        pedido.setEstado(new Cancelado());
    }
    @Override
    public void Finalizar(Pedido pedido) throws Exception {
        pedido.setEstado(new Finalizado());
    }
}
