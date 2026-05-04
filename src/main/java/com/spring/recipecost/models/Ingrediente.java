package com.spring.recipecost.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Ingredientes")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column(name = "preco_pacote", precision = 19, scale = 2)
    private BigDecimal precoPacote;

    @Column(name = "quantidade_pacote", precision = 19, scale = 2)
    private BigDecimal quantPacote;


}
