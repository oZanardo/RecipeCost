package com.spring.recipecost.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecipeCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Receita")
    private String nome;

    @OneToMany
    List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

    @Column(name = "Quantidade", precision = 19, scale = 2)
    private BigDecimal quantPacote;

    @Column(name = "Preco_custo", precision = 19, scale = 2)
    private BigDecimal precoCusto;


}
