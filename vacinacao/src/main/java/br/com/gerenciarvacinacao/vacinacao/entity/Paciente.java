package br.com.gerenciarvacinacao.vacinacao.entity;
import lombok.*;

@Data
public class Paciente {
        private String id;
        private String nome;
        private String sobrenome;
        private String cpf;
        private int idade;
        private String sexo;
        private String contato;
        private String logradouro;
        private String numero;
        private String bairro;
        private String cep;
        private String municipio;
        private String estado;
}
