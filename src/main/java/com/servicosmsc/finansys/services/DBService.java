package com.servicosmsc.finansys.services;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicosmsc.finansys.domain.Categoria;
import com.servicosmsc.finansys.domain.Lancamento;
import com.servicosmsc.finansys.repositories.CategoriaRepository;
import com.servicosmsc.finansys.repositories.LancamentoRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public void instantiateTestDatabase() {
		
		Categoria cat1 = new Categoria(null, "Moradia", "Pagamentos de contas da Casa");
		Categoria cat2 = new Categoria(null, "Saúde", "Plano de Saúde e Remédios");
		Categoria cat3 = new Categoria(null, "Lazer", "Cinema, parques, praia, etc");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
		Date d1 = new Date();
		Lancamento l1 = new Lancamento(null, cat1, "Alguma coisa", "Alguma descricao", "10.2", "2", true, d1);
		
		lancamentoRepository.saveAll(Arrays.asList(l1));
	}
}
