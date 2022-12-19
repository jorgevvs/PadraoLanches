package Aplicação.Estados.EstadosPedido;

import Common.Pedido;

public class Disponivel implements Estado{

    @Override
    public void AplicarDescontoExtra(Pedido pedido) throws Exception {
        if(pedido.getDescontoFoiAplicado()){
            throw new Exception("Já foi aplicado desconto neste pedido");
        }
        pedido.aplicaDesconto();
    }
    @Override
    public void Produzir(Pedido pedido)
    {
        pedido.setEstado(new Produzindo());
    }
    @Override
    public void Cancelar(Pedido pedido)
    {
        pedido.setEstado(new Cancelado());
    }
    @Override
    public void Finalizar(Pedido pedido) throws Exception {
        throw new Exception("Não se pode passar um pedido disponível para finalizado!");
    }

}
