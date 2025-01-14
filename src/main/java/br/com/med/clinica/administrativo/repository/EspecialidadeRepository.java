package br.com.med.clinica.administrativo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.med.clinica.administrativo.model.Especialidade;

@Transactional
@Repository
public interface EspecialidadeRepository extends CrudRepository<Especialidade,Long>{

	
	List<Especialidade> findAll();
}
