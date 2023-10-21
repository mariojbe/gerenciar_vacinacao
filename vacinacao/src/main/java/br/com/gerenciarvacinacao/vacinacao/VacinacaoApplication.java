package br.com.gerenciarvacinacao.vacinacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@SpringBootApplication
public class VacinacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(VacinacaoApplication.class, args);
	}
}
