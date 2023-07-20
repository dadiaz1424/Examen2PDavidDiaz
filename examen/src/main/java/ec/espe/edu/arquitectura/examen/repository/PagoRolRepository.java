package ec.espe.edu.arquitectura.examen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.espe.edu.arquitectura.examen.model.PagoRol;

@Repository
public interface PagoRolRepository extends MongoRepository<PagoRol, String> {
}
