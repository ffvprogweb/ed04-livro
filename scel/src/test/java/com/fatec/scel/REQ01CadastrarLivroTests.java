package com.fatec.scel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.scel.model.Livro;
@SpringBootTest
class REQ01CadastrarLivroTests {

	@Test
	void ct01_cadastrar_livro_com_sucesso() {
		Livro livro = new Livro();
		livro.obtemAno();
	}

}
