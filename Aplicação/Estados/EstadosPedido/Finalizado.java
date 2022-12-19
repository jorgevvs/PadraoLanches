package Aplicação.Estados.EstadosPedido;

import Common.Pedido;

public class Finalizado implements Estado{
    @Override
    public void AplicarDescontoExtra(Pedido pedido) throws Exception {
        throw new Exception("O pedido já foi finalizado, não é possível aplicar descontos!");
    }
    @Override
    public void Produzir(Pedido pedido) throws Exception {
        throw new Exception("O pedido já foi finalizado!");
    }
    @Override
    public void Cancelar(Pedido pedido) throws Exception {
        throw new Exception("O pedido já foi finalizado!");
    }
    @Override
    public void Finalizar(Pedido pedido) throws Exception {
        throw new Exception("O pedido já foi finalizado!");
    }
}
