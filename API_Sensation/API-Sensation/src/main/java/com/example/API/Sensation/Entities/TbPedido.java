package com.example.API.Sensation.Entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_pedido")
public class TbPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pd_id", nullable = false)
    private Integer id;

    @Column(name = "pd_valor", precision = 9, scale = 2)
    private BigDecimal pdValor;

    @Column(name = "pd_hora", nullable = false)
    private Instant pdHora;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pd_cli_id")
    private TbCliente pdCli;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPdValor() {
        return pdValor;
    }

    public void setPdValor(BigDecimal pdValor) {
        this.pdValor = pdValor;
    }

    public Instant getPdHora() {
        return pdHora;
    }

    public void setPdHora(Instant pdHora) {
        this.pdHora = pdHora;
    }

    public TbCliente getPdCli() {
        return pdCli;
    }

    public void setPdCli(TbCliente pdCli) {
        this.pdCli = pdCli;
    }

}