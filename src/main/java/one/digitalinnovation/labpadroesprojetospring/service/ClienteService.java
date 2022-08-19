package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente inserir(Cliente cliente);

    Cliente atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
