package br.com.gerenciarvacinacao.vacinacao.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vacina {
    private String id;
    private int codigo;
    private String nome;
    private String fabricante;
    private String lote;
    private Date validade;
    private int doses;
    private String intervaloEntreDoses;
}