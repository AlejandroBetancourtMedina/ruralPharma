package com.ruralpharma.ruralPharma.controller;

import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("paciente/")
@CrossOrigin(origins = "http://localhost:4200/")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/nuevo")
    public ResponseEntity<Paciente> crearPaciente(@RequestBody Paciente paciente) {
        Paciente response = pacienteService.crear(paciente);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Paciente>> listarPaciente() {
        return new ResponseEntity<>(pacienteService.listar(), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{rut}")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable String rut, @RequestBody Paciente paciente) {
        Paciente response = pacienteService.actualizar(rut, paciente);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{rut}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable String rut){
        pacienteService.eliminar(rut);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

