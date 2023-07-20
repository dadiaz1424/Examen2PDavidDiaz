package ec.espe.edu.arquitectura.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.espe.edu.arquitectura.examen.model.Empresa;

@Repository
public interface EmpresaRepository extends MongoRepository<Empresa, String> {
}
