package modules.entrega;

import modules.motorista.Motorista;
import modules.pedido.Pedido;
import modules.entrega.domain.enums.EntregaEnum;

import java.time.LocalDateTime;

public class Entrega {
    private int id;
    private Pedido pedido;
    private Motorista motorista;
    private LocalDateTime data_saida;
    private LocalDateTime data_entrega;
    private EntregaEnum status;

    public Entrega(int id, Pedido pedido, Motorista motorista, LocalDateTime data_saida, LocalDateTime data_entrega, EntregaEnum status) {
        this.id = id;
        this.pedido = pedido;
        this.motorista = motorista;
        this.data_saida = data_saida;
        this.data_entrega = data_entrega;
        this.status = status;
    }
}