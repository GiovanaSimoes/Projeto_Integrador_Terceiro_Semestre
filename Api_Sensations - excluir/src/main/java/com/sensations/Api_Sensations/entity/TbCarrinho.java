package com.sensations.Api_Sensations.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_carrinho")
public class TbCarrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id", nullable = false)
    private Integer id;

    @Column(name = "car_quantidade")
    private Integer carQuantidade;

    @Column(name = "car_cli_id")
    private Integer carCliId;

    @Column(name = "car_prv_id")
    private Integer carPrvId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarQuantidade() {
        return carQuantidade;
    }

    public void setCarQuantidade(Integer carQuantidade) {
        this.carQuantidade = carQuantidade;
    }

    public Integer getCarCliId() {
        return carCliId;
    }

    public void setCarCliId(Integer carCliId) {
        this.carCliId = carCliId;
    }

    public Integer getCarPrvId() {
        return carPrvId;
    }

    public void setCarPrvId(Integer carPrvId) {
        this.carPrvId = carPrvId;
    }

}