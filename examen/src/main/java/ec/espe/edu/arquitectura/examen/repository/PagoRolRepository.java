package ec.espe.edu.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ec.espe.edu.arquitectura.examen.model.PagoRol;

@Repository
public interface PagoRolRepository extends MongoRepository<PagoRol, String> {
     List<PagoRol> findByRucEmpresaAndMes(String rucEmpresa, String mes);
}
