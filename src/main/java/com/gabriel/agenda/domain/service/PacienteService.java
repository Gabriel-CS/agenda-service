package com.gabriel.agenda.domain.service;

import com.gabriel.agenda.domain.entity.Paciente;
import com.gabriel.agenda.domain.repository.PacienteRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Data
@RequiredArgsConstructor
@Service
@Transactional
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public Paciente salvar(Paciente paciente) {

        // TODO: para validar se o cpf já não existe

        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return pacienteRepository.findById(id);
    }

    public void deletar(Long id) {
        pacienteRepository.deleteById(id);
    }


}
