package br.com.gerenciarvacinacao.vacinacao.repository;

import br.com.gerenciarvacinacao.vacinacao.entity.Vacina;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;
import java.util.Optional;
    public interface VacinaRepository extends MongoRepository<Vacina,String> {
        public Optional<Vacina> findVacinaById(String id);
        public List<Vacina> findVacinaByNome(String nome);
    }

