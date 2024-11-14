/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.clinica.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cientifica.clinica.entity.Cita;
import pe.edu.cientifica.clinica.repository.CitaRepository;
import pe.edu.cientifica.clinica.service.CitaService;

/**
 *
 * @author Docente
 */
@Service
public class CitaServiceImpl implements CitaService{

    @Autowired
    private CitaRepository  citaRepository;
    
    @Override
    public Cita create(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Cita update(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public void delete(Long id) {
        citaRepository.deleteById(id);
        
    }

    @Override
    public Optional<Cita> read(Long id) {
        return citaRepository.findById(id);
        
    }

    @Override
    public List<Cita> readAll() {
        return citaRepository.findAll();
        
    }
    
}
