// Este arquivo representa a entidade de criação de entrega e
// inclui campos que correspondem ao corpo de uma requisição
package model;

import com.google.gson.annotations.Expose;
import lombok.Data;

@Data
public class EntregaModel {
    @Expose(serialize = false)
    private int numeroEntrega;
    @Expose
    private int numeroPedido;
    @Expose
    private String nomeEntregador;
    @Expose
    private String statusEntrega;
    @Expose
    private String dataEntrega;
}