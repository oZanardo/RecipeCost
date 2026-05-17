package com.spring.recipecost.repositories;


import com.spring.recipecost.models.ItemReceita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensRecipeRepository extends JpaRepository<ItemReceita,Long> {
}
