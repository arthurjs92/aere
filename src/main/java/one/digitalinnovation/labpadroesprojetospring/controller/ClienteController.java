package one.digitalinnovation.labpadroesprojetospring.controller;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.service.imp.ClienteServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImp clienteServiceImp;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteServiceImp.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteServiceImp.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteServiceImp.inserir(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> autalizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteServiceImp.atualizar(id, cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteServiceImp.deletar(id);
        return ResponseEntity.ok().build();
    }

}
