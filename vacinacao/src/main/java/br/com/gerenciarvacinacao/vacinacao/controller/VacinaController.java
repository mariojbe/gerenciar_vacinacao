package br.com.gerenciarvacinacao.vacinacao.controller;

import br.com.gerenciarvacinacao.vacinacao.entity.Vacina;
import br.com.gerenciarvacinacao.vacinacao.httpClient.VacinaHttpClient;

import br.com.gerenciarvacinacao.vacinacao.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/vacina")
public class VacinaController {
//    @Autowired//(required = true)
//    VacinaHttpClient vacinaHttpClient;
//    @Autowired
//    VacinaService vacinaService;
    @GetMapping("/vacinas")
    public ResponseEntity<?> vacinas() {
        //Vacina vacina = vacinaHttpClient.obterVacinas();
        return ResponseEntity.ok().body("vacina");
    }
}
