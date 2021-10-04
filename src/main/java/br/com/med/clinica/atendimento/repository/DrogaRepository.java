package br.com.med.clinica.atendimento.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.med.clinica.atendimento.model.Droga;

@Transactional
@Repository
public interface DrogaRepository extends CrudRepository<Droga, Long> {

	List<Droga> findAll();

	Optional<Droga> findById(Long id);

}
