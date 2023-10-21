package br.com.gerenciarvacinacao.vacinacao.httpClient;
import br.com.gerenciarvacinacao.vacinacao.entity.Vacina;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "vacina", url = "https://api-vacinas-bsi-f03cac251e91.herokuapp.com/api")
public interface VacinaHttpClient {
    @GetMapping("/vacinas")
    public Vacina obterVacinas();

    @GetMapping("/obter/{id}")
    public Vacina obterEnderecoPorCep(@PathVariable("") String id);

}
