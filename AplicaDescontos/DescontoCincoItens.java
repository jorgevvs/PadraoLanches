package AplicaDescontos;

import Common.Pedido;

public class DescontoCincoItens implements Desconto{
    public Desconto Proximo;

    public Desconto getProximo() {
        return Proximo;
    }

    public void setProximo(Desconto proximo) {
        Proximo = proximo;
    }

    public double Desconta(Pedido pedido)
    {
        if(pedido.Ingredientes.size() > 5)
        {
            return pedido.valor * 0.1;
        }

        return Proximo.Desconta(pedido);
    }
}
