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
    @JoinColumn(name = "id_Ingrediente")
    private Ingrediente ingrediente;

    @Column(name = "quant_used", precision = 19, scale = 2)
    private BigDecimal quantidadeUsada;

}
