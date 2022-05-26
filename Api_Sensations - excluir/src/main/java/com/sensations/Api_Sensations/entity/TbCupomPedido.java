package com.sensations.Api_Sensations.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_cupom_pedido")
public class TbCupomPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpp_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cpp_pd_id")
    private TbPedido cppPd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cpp_cp_id")
    private TbCupom cppCp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TbPedido getCppPd() {
        return cppPd;
    }

    public void setCppPd(TbPedido cppPd) {
        this.cppPd = cppPd;
    }

    public TbCupom getCppCp() {
        return cppCp;
    }

    public void setCppCp(TbCupom cppCp) {
        this.cppCp = cppCp;
    }

}