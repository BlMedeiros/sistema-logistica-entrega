package modules.pedido;

import modules.cliente.Cliente;
import modules.pedido.domain.enums.StatusEnum;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private Cliente cliente;
    private LocalDate data_pedido;
    private Double volume_m3;
    private Double peso_kg;
    private StatusEnum status;

    public Pedido(int id, Cliente cliente, LocalDate data_pedido, Double volume_m3, Double peso_kg, StatusEnum status) {
        this.id = id;
        this.cliente = cliente;
        this.data_pedido = data_pedido;
        this.volume_m3 = volume_m3;
        this.peso_kg = peso_kg;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(LocalDate data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Double getVolume_m3() {
        return volume_m3;
    }

    public void setVolume_m3(Double volume_m3) {
        this.volume_m3 = volume_m3;
    }

    public Double getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(Double peso_kg) {
        this.peso_kg = peso_kg;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
