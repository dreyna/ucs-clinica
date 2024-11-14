package pe.edu.cientifica.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cientifica.clinica.entity.Cita;

/**
 *
 * @author Docente
 */
public interface CitaRepository extends JpaRepository<Cita, Long>{
    
}
