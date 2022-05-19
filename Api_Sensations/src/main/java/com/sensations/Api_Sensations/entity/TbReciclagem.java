package com.sensations.Api_Sensations.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_reciclagem")
public class TbReciclagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rec_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rec_cli_id")
    private TbCliente recCli;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TbCliente getRecCli() {
        return recCli;
    }

    public void setRecCli(TbCliente recCli) {
        this.recCli = recCli;
    }

}