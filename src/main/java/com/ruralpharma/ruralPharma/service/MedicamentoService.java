package com.ruralpharma.ruralPharma.service;

import com.ruralpharma.ruralPharma.entity.Login;
import com.ruralpharma.ruralPharma.entity.Medicamento;
import com.ruralpharma.ruralPharma.repository.LoginRepository;
import com.ruralpharma.ruralPharma.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository medicamentoRepository;
    public Medicamento crear(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);}

    public List<Medicamento> listar() {
        return medicamentoRepository.findAll();
    }

    public Optional<Medicamento> listarUno (int id){
        return medicamentoRepository.findById(id);
    }
    public Medicamento actualizar(Integer id, Medicamento medicamento) {
        Optional<Medicamento> response = medicamentoRepository.findById(Integer.valueOf(id));

        if(!response.isPresent()){
            throw  new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("Medicamento %s no se encuentra", id));
        }
        response.get().setProducto(medicamento.getProducto());
        response.get().setFechaEntrega(medicamento.getFechaEntrega());
        response.get().setDescripcion(medicamento.getDescripcion());
        response.get().setCantidad(medicamento.getCantidad());
        response.get().setLote(medicamento.getLote());
        response.get().setFechaVencimiento(medicamento.getFechaVencimiento());
        response.get().setFechaActualizacion(medicamento.getFechaActualizacion());

        return medicamentoRepository.save(response.get());
    }

    public void eliminar(Integer id) {
        Optional<Medicamento> response = medicamentoRepository.findById(Integer.valueOf(id));
        if(!response.isPresent()){
            throw new ResponseStatusException
                    (HttpStatus.NOT_FOUND, String.format("El Medicamento %s no se encuentra. Verifique los datos para eliminar", id));
        }
        medicamentoRepository.delete(response.get());
    }
}

