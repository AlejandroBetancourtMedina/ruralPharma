package com.ruralpharma.ruralPharma.service;

import com.ruralpharma.ruralPharma.entity.Login;
import com.ruralpharma.ruralPharma.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;
    public Login crear(Login login) {
        return loginRepository.save(login);}

    public List<Login> listar() {
        return loginRepository.findAll();
    }

    public Login actualizar(String rut, Login login) {
        Optional<Login> response = loginRepository.findById(Integer.valueOf(rut));

        if(!response.isPresent()){
            throw  new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("Login %s no se encuentra", rut));
        }
        response.get().setUsuario(login.getUsuario());
        response.get().setContraseña(login.getContrasena());
        response.get().setNombre(login.getNombre());
        response.get().setApellido(login.getApellido());
        response.get().setProfesion(login.getProfesion());
        response.get().setFechaActualizacion(login.getFechaActualizacion());

        return loginRepository.save(response.get());
    }

    public void eliminar(String rut) {
        Optional<Login> response = loginRepository.findById(Integer.valueOf(rut));
        if(!response.isPresent()){
            throw new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("El Login %s no se encuentra. Verifique los datos para eliminar", rut));
                    }
            loginRepository.delete(response.get());
    }
}

