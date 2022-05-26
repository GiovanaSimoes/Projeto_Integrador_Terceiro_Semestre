package com.example.API.Sensation.Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_cupom")
public class TbCupom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_id", nullable = false)
    private Integer id;

    @Column(name = "cp_valor", precision = 9, scale = 2)
    private BigDecimal cpValor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cp_fun_id")
    private TbFuncionario cpFun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cp_rec_id")
    private TbReciclagem cpRec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCpValor() {
        return cpValor;
    }

    public void setCpValor(BigDecimal cpValor) {
        this.cpValor = cpValor;
    }

    public TbFuncionario getCpFun() {
        return cpFun;
    }

    public void setCpFun(TbFuncionario cpFun) {
        this.cpFun = cpFun;
    }

    public TbReciclagem getCpRec() {
        return cpRec;
    }

    public void setCpRec(TbReciclagem cpRec) {
        this.cpRec = cpRec;
    }

}