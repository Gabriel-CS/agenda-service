package com.gabriel.agenda.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_paciente")
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
}
