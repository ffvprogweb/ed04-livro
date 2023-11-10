package com.fatec.scel.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Livro {
	String isbn;
	String titulo;
	String autor;
	int edicao;
	String data;
	Logger logger = LogManager.getLogger(this.getClass());

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	
	public String obtemAno() {
		DateTime anoAtual = new DateTime();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY");
		logger.info(">>>>>> setDataEmissao para data de hoje => " + anoAtual.toString(fmt));
		return anoAtual.toString(fmt);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
