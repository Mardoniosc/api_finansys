package com.servicosmsc.finansys;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.servicosmsc.finansys.domain.Categoria;
import com.servicosmsc.finansys.domain.Lancamento;
import com.servicosmsc.finansys.repositories.CategoriaRepository;
import com.servicosmsc.finansys.repositories.LancamentoRepository;

@SpringBootApplication
public class FinansysApiApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FinansysApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Moradia", "Pagamentos de contas da Casa");
		Categoria cat2 = new Categoria(null, "Saúde", "Plano de Saúde e Remédios");
		Categoria cat3 = new Categoria(null, "Lazer", "Cinema, parques, praia, etc");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
		Date d1 = new Date();
		Lancamento l1 = new Lancamento(null, cat1, "Alguma coisa", "Alguma descricao", "10.2", "2", true, d1);
		
		lancamentoRepository.saveAll(Arrays.asList(l1));
		
	}

}
