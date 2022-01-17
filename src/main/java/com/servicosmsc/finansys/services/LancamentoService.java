package com.servicosmsc.finansys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.servicosmsc.finansys.domain.Lancamento;
import com.servicosmsc.finansys.repositories.LancamentoRepository;
import com.servicosmsc.finansys.services.exceptions.DataIntegrityException;
import com.servicosmsc.finansys.services.exceptions.ObjectNotFoundException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository repo;

	public Lancamento find(Integer id) {
		Optional<Lancamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Lancamento.class.getName()));
	}
	
	public Lancamento insert(Lancamento obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Lancamento update(Lancamento obj) {
		find(obj.getId());

		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);			
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir o Lancamento.");
		}
	}
	
	public List<Lancamento> findAll() {
		return repo.findAll();
	}

}