package one.digitalinnovation.labpadroesprojetospring.repository;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
