package com.ruralpharma.ruralPharma.service;

import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;
    public Paciente crear(Paciente paciente) {
        return pacienteRepository.save(paciente);}

    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    public Paciente listarUno(int rut){
        return pacienteRepository.findById(rut).get();
    }

    public Paciente actualizar(String rut, Paciente paciente) {
        Optional<Paciente> response = pacienteRepository.findById(Integer.valueOf(rut));

        if(!response.isPresent()){
            throw  new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("Paciente %s no se encuentra", rut));
        }
        response.get().setNombre(paciente.getNombre());
        response.get().setfNacimiento(paciente.getfNacimiento());
        response.get().setTelefono(paciente.getTelefono());
        response.get().setDomicilio(paciente.getDomicilio());
        response.get().setFechaActualizacion(paciente.getFechaActualizacion());

        return pacienteRepository.save(response.get());
    }

    public void eliminar(String rut) {
        Optional<Paciente> response = pacienteRepository.findById(Integer.valueOf(rut));
        if(!response.isPresent()){
            throw new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("El Paciente %s no se encuentra. Verifique los datos para eliminar", rut));
        }
        pacienteRepository.delete(response.get());
    }
}



