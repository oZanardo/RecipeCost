package com.spring.recipecost.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Receita", nullable = false)
    private String nome;

    @OneToMany
    List<ItemReceita> ItemReceita = new ArrayList<ItemReceita>();


}
