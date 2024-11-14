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
@Table(name = "medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta")
    private Long id; // (PK, int): Identificador único de la receta.
    @Column(name = "duracion", length = 50)
    private String duracion; // (varchar, 50): Duración del tratamiento.
    @Column(name = "indicaciones")
    private String indicaciones; // (text): Indicaciones adicionales.

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "medicamento")
    @JsonIgnore
    private Set<Receta> recetas;
}
