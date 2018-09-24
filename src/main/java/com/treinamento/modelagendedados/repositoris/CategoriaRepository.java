package com.treinamento.modelagendedados.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treinamento.modelagendedados.domaim.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {

}
