/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.clinica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento")
    private Long id; // (PK, int): Identificador único del medicamento.
    @Column(name = "nombre", length = 100)
    private String nombre; // (varchar, 100): Nombre del medicamento.
    @Column(name = "descripcion")
    private String descripcion; // (text): Descripción o detalles del medicamento.
    @Column(name = "stock")
    private int stock; // (int): Cantidad en existencia.
    @Column(name = "precio")
    private double precio; // (decimal, 10, 2): Precio por unidad.

    @ManyToOne
    @JoinColumn(name = "medicamento_id", nullable = false)
    private Medicamento medicamento;
    
    @ManyToOne
    @JoinColumn(name = "historia_id", nullable = false)
    private HistorialMedico historial;
}
