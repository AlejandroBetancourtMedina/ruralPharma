package com.ruralpharma.ruralPharma.controller;

import com.ruralpharma.ruralPharma.entity.Paciente;
import com.ruralpharma.ruralPharma.entity.Rol;
import com.ruralpharma.ruralPharma.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rol/")
@CrossOrigin(origins = "http://localhost:4200/")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("/nuevo")
    public ResponseEntity<Rol> crearRol(@RequestBody Rol rol) {
        Rol response = rolService.crear(rol);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Rol>> listarRol() {
        return new ResponseEntity<>(rolService.listar(), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Rol> actualizarRol(@PathVariable Integer id, @RequestBody Rol rol) {
        Rol response = rolService.actualizar(id, rol);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarRol(@PathVariable Integer rol){
        rolService.eliminar(rol);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
