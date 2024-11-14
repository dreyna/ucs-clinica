package pe.edu.cientifica.clinica.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;
    @Column(name = "nombre", length = 100)
    private String nombre; // (varchar, 100): Nombre del paciente.
    @Column(name = "apellido", length = 100)
    private String apellido; // (varchar, 100): Apellido del paciente.
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fecha_nac; // fecha_nacimiento (date): Fecha de nacimiento.
    @Column(name = "direccion", length = 255)
    private String direccion;// (varchar, 255): Dirección del paciente.
    @Column(name = "telefono", length = 20)
    private String telefono; // (varchar, 20): Teléfono de contacto.
    @Column(name = "correo", length = 100)
    private String correo; // (varchar, 100): Correo electrónico del paciente.
    @Column(name = "sexo")
    private char sexo; // (char, 1): Género del paciente (M/F).

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
    @JsonIgnore
    private Set<Cita> citas;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
    @JsonIgnore
    private Set<HistorialMedico> historias;

}
