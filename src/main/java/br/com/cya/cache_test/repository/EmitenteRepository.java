package br.com.cya.cache_test.repository;

import br.com.cya.cache_test.model.Emitente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmitenteRepository extends JpaRepository<Emitente, Long> {

}
