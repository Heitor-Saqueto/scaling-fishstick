package br.com.heitorsaqueto.screematch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ApiCharacter(@JsonAlias("name") String nome, 
						@JsonAlias("species") String especie,
						@JsonAlias("gender") String genero){
	

}
