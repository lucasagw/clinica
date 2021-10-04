package br.com.med.clinica.atendimento.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.med.clinica.atendimento.model.Atendimento;
import br.com.med.clinica.atendimento.model.Exame;

@Transactional
@Repository
public interface ExameRepository extends CrudRepository<Exame,Long>{

	List<Exame> findAll();
		
	Optional<Exame> findById(Long id);
	
	List<Exame> findByAtendimento(Atendimento atendimento);
	
}
