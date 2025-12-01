package br.com.heitorsaqueto.screematch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.heitorsaqueto.screematch.model.ApiCharacter;
import br.com.heitorsaqueto.screematch.services.ConsumoApi;
import br.com.heitorsaqueto.screematch.services.ConverteDados;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://rickandmortyapi.com/api/character/2");
		
		System.out.println(json);
		
		ConverteDados conversor = new ConverteDados(); 
		
		ApiCharacter dados =  conversor.obterDados(json, ApiCharacter.class);
		
		System.out.println(dados);

	}
}
