package com.cursomc.cursomc.repositories;

import com.cursomc.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepostitory extends JpaRepository<Cidade, Long> {

}
