package com.ruralpharma.ruralPharma.service;

import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.entity.Rol;
import com.ruralpharma.ruralPharma.repository.PacienteRepository;
import com.ruralpharma.ruralPharma.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;
    public Rol crear(Rol rol) {
        return rolRepository.save(rol);}

    public List<Rol> listar() {
        return rolRepository.findAll();
    }

    public Rol actualizar(Integer id, Rol rol) {
        Optional<Rol> response = rolRepository.findById(Integer.valueOf(id));

        if(!response.isPresent()){
            throw  new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("Rol de Usuario %s no se encuentra", id));
        }
        response.get().setRol(rol.getRol());

        return rolRepository.save(response.get());
    }

    public void eliminar(Integer id) {
        Optional<Rol> response = rolRepository.findById(Integer.valueOf(id));
        if(!response.isPresent()){
            throw new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("El Rol de Usuario %s no se encuentra. Verifique los datos para eliminar", id));
        }
        rolRepository.delete(response.get());
    }
}


