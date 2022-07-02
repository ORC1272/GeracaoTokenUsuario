package cro.avaliacaofilme.rest.api.repository;

import cro.avaliacaofilme.rest.api.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
//import org.springframework.data.repository.CrudRepository;

//public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {
    public Optional<UsuarioModel> findByLogin(String Login);
}
