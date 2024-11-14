package pe.edu.cientifica.clinica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
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
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cita")
    private Long id; // (PK, int): Identificador único de la cita.
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha; // (datetime): Fecha y hora de la cita.
    @Column(name = "motivo", length = 100)
    private String motivo; // (varchar, 255): Motivo de la cita.
    @Column(name = "estado", length = 50)
    private String estado; // (varchar, 50): Estado de la cita (Ej., pendiente, completada, cancelada).

    @ManyToOne
    @JoinColumn(name="paciente_id", nullable = false)
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name="medico_id", nullable = false)
    private Medico medico;
}
