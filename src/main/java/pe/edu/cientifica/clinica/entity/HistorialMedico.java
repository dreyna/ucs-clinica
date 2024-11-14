package pe.edu.cientifica.clinica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Docente
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "HistorialMedico")
public class HistorialMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_medico")
    private Long id; // (FK, int): Identificador del paciente.
    @Column(name = "fecha_consulta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_consulta; // (datetime): Fecha de la consulta.
    @Column(name = "diagnostico")
    private String diagnostico; // (text): Diagnóstico de la consulta.
    @Column(name = "tratamiento")
    private String tratamiento; // (text): Tratamiento sugerido.
    @Column(name = "observaciones")
    private String observaciones; // (text): Observaciones adicionales.

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Paciente paciente;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "historial")
    @JsonIgnore
    private Set<Receta> recetas;
}
