package AplicaDescontos;

import Common.Pedido;

public interface Desconto {
    double Desconta(Pedido pedido);
    Desconto Proximo = null;

    void setProximo(Desconto proximo);
}
