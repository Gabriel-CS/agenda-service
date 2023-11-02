package com.gabriel.agenda.api.controller;

import com.gabriel.agenda.domain.entity.Paciente;
import com.gabriel.agenda.domain.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService pacienteService;

    @PostMapping
    public ResponseEntity<Paciente> salvar(@RequestBody Paciente paciente) {
        Paciente pacienteSalvo = pacienteService.salvar(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body(pacienteSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> procurarTodos() {
        List<Paciente> pacientes = pacienteService.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(pacientes);
    }


}
