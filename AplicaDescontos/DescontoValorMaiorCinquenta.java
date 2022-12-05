package AplicaDescontos;

import Common.Pedido;

public class DescontoValorMaiorCinquenta implements Desconto{
    public Desconto Proximo;

    public Desconto getProximo() {
        return Proximo;
    }
    @Override
    public void setProximo(Desconto proximo) {
        Proximo = proximo;
    }

    public double Desconta(Pedido pedido)
    {
        if(pedido.valor > 50)
        {
            return pedido.valor * 0.07;
        }
        else
        {
            return Proximo.Desconta(pedido);
        }
    }
}
