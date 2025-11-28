package br.com.heitorsaqueto.screematch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.heitorsaqueto.screematch.services.ConsumoApi;

@SpringBootApplication
public class ScreematchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreematchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		
		System.out.println(json);
	}

}
