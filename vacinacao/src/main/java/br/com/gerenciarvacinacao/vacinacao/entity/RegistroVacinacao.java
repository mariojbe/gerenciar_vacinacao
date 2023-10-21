package br.com.gerenciarvacinacao.vacinacao.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "registrovacinacao")
@Data
public class RegistroVacinacao {
   Date DataDeVacinação;
   int IdentificaçãoDoPaciente;
   int IdentificaçãoDaVacina;
   int IdentificaçãoDaDose;
   ProfissinalDeSaude IdentificaçãoDoProfissionalDeSaúde;
}
