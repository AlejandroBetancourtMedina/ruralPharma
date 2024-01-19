package com.ruralpharma.ruralPharma.controller;

import com.ruralpharma.ruralPharma.entity.Login;
import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login/")
@CrossOrigin(origins = "http://localhost:4200/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/nuevo")
    public ResponseEntity<Login> crearLogin(@RequestBody Login login) {
        Login response = loginService.crear(login);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Login>> listarLogin() {
        return new ResponseEntity<>(loginService.listar(), HttpStatus.OK);
    }

    @GetMapping("/listarUno/{rut}")
    public ResponseEntity<Login> listarUnLogin(@PathVariable("rut") int rut) {
        return new ResponseEntity (loginService.listarUno(rut), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{rut}")
    public ResponseEntity<Login> actualizarLogin(@PathVariable String rut, @RequestBody Login login) {
        Login response = loginService.actualizar(rut, login);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{rut}")
    public ResponseEntity<Void> eliminarLogin(@PathVariable String rut){
        loginService.eliminar(rut);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}