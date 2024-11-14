/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medico")
    private Long id; // (PK, int): Identificador único del médico.
    @Column(name = "nombre", length = 100)
    private String nombre; // (varchar, 100): Nombre del médico.
    @Column(name = "apellido", length = 100)
    private String apellido; // (varchar, 100): Apellido del médico.
    @Column(name = "especialidad", length = 100)
    private String especialidad; // (varchar, 100): Especialidad médica.
    @Column(name = "telefono", length = 20)
    private String telefono; // (varchar, 20): Teléfono de contacto.
    @Column(name = "correo", length = 100)
    private String correo; // (varchar, 100): Correo electrónico.
    @Column(name = "horario_atencion", length = 50)
    private String horario_atencion; // (varchar, 50): Horario de atención.

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "medico")
    @JsonIgnore
    private Set<Cita> citas;

}
