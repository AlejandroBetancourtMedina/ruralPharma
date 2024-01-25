package com.ruralpharma.ruralPharma.controller;

import com.ruralpharma.ruralPharma.entity.Login;
import com.ruralpharma.ruralPharma.entity.Medicamento;
import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.service.MedicamentoService;
import com.ruralpharma.ruralPharma.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicamento/")
@CrossOrigin(origins = "http://localhost:4200/")
public class MedicamentoController {
    @Autowired
    private MedicamentoService medicamentoService;

    @PostMapping("/nuevo")
    public ResponseEntity<Medicamento> crearMedicamento(@RequestBody Medicamento medicamento) {
        Medicamento response = medicamentoService.crear(medicamento);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Medicamento>> listarMedicamento() {
        return new ResponseEntity<>(medicamentoService.listar(), HttpStatus.OK);
    }
    @GetMapping("/listarUno/{id}")
    public ResponseEntity<Medicamento> listarUnoMedicamento(@PathVariable("id") int id) {
        return new ResponseEntity <>(medicamentoService.listarUnoMedicamento(id), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Medicamento> actualizarMedicamento(@PathVariable Integer id, @RequestBody Medicamento medicamento) {
        Medicamento response = medicamentoService.actualizar(id, medicamento);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarMedicamento(@PathVariable Integer id){
        medicamentoService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}