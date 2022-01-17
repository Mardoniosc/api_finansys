package com.servicosmsc.finansys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicosmsc.finansys.domain.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>{

}
