package br.com.gerenciarvacinacao.vacinacao.service;
import br.com.gerenciarvacinacao.vacinacao.entity.Vacina;
import br.com.gerenciarvacinacao.vacinacao.repository.VacinaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacinaService {
//    @Autowired
//    VacinaRepository vacinaRepository;
//    public List<Vacina> obterTodos(){
//        return  vacinaRepository.findAll();
//    }
//    public String convertJson() throws JsonProcessingException {
//        Vacina vacina = new Vacina();
//        ObjectMapper objectMapper = new ObjectMapper();
//        //convertendo para string
//        return objectMapper.writeValueAsString(vacina);
//        //convertendo para tipo Aluno    (registro, class/tipo a ser convertido)
//        //return  objectMapper.readValue(aluno, Aluno.class);
//    }
//
//    public  List<Vacina> obterPorNome(String nome){
//        return  vacinaRepository.findVacinaByNome(nome);
//    }
//
//    public Vacina inserir( Vacina vacina){
//        //listaDeAlunos.add(aluno);
//        vacinaRepository.insert(vacina);
//        return vacina;
//    }
//
//    public Vacina atualizar(String id, Vacina novosDadosDaVacina){
//        Optional<Vacina> vacina = selecionarVacinaPeloId(id);
//        if (vacina.isPresent()){
//          BeanUtils.copyProperties(novosDadosDaVacina, vacina.get());
//            vacinaRepository.save(vacina.get());
//            return vacina.get();
//        }
//        return  null;
//    }
//    public void deletar(String id){
//        Optional<Vacina> vacina = selecionarVacinaPeloId(id);
//
//        vacina.ifPresent(value -> vacinaRepository.delete(value));
//    }
//    public Optional<Vacina> selecionarVacinaPeloId(String id){
//        return  vacinaRepository.findVacinaById(id);
//
//    }
}
