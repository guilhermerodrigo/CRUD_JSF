package controle;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controle.modelo.Pessoa;

public class ControleEntradaTest {
	
	private ControleEntrada controleEntrada = new ControleEntrada();

	@Test
	public void deveApagarTodosOsCamposDeCadastroQuandoChamaLimpar() {
		controleEntrada.setNome("Nome");
		controleEntrada.setEndereco("endereco");
		controleEntrada.setNumero("numero");
		controleEntrada.setTelefone("telefone");
		controleEntrada.setCidade("cidade");
		
		
		controleEntrada.limpar();
		
		assertTrue(controleEntrada.getNome().equals(""));
		assertTrue(controleEntrada.getEndereco().equals(""));
		assertTrue(controleEntrada.getNumero().equals(""));
		assertTrue(controleEntrada.getTelefone().equals(""));
		assertTrue(controleEntrada.getCidade().equals(""));
	}
	
	@Test
	public void devePreencherOsCamposComValoresDePessoa(){
		// setar dados
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("rodrigo");
		
		//chamar metodos que quer testar
		controleEntrada.alterarPessoa(pessoa);
		
		//fazer os asserts
		assertTrue(controleEntrada.getNomeA().equals("rodrigo"));
	}

}
