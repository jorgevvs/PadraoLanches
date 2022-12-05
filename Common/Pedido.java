package Common;

import Common.Ingrediente;

import java.util.List;

public class Pedido {
    public Double valor;
    public List<Ingrediente> Ingredientes;


    public List<Ingrediente> getIngredientes() {
        return Ingredientes;
    }

    public Double getValor() {
        return valor;
    }
}
