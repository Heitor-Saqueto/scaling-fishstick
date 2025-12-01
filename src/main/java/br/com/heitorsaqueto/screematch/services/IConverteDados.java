package br.com.heitorsaqueto.screematch.services;

public interface IConverteDados {

	<T> T obterDados(String json, Class<T> classe);
}
