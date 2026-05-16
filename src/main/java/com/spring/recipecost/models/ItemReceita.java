package com.spring.recipecost.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemReceita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_Ingrediente", nullable = false)
    private Ingrediente ingrediente;

    @ManyToOne
    @JoinColumn(name = "recipe_cost_id", nullable = false)
    private RecipeCost recipeCost;

    @Column(name = "quant_used", precision = 19, scale = 2)
    private BigDecimal quantidadeUsada;

}
