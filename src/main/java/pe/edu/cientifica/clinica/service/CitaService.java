
package pe.edu.cientifica.clinica.service;

import java.util.List;
import java.util.Optional;
import pe.edu.cientifica.clinica.entity.Cita;

/**
 *
 * @author Docente
 */
public interface CitaService {
    Cita create(Cita cita);
    Cita update(Cita cita);
    void delete(Long id);
    Optional<Cita> read(Long id);
    List<Cita> readAll();
}
