package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import controle.modelo.Pessoa;
import controle.modelo.PessoaManeger;

@ManagedBean(name = "controleEntrada")
@SessionScoped
public class ControleEntrada implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String endereco;
	private String numero;
	private String telefone;
	private String cidade;
	private String nomeA;
	private String enderecoA;
	private String numeroA;
	private String telefoneA;
	private String cidadeA;
	private List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	
	public ControleEntrada() {
		PessoaManeger pessoaManager = new PessoaManeger();
		pessoaManager.inicializar();
		this.listaPessoa = pessoaManager.buscarPessoas();
		pessoaManager.terminar();
	}
	
	public void salvarPessoa() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setEndereco(endereco);
		pessoa.setNumero(numero);
		pessoa.setTelefone(telefone);
		pessoa.setCidade(cidade);

		PessoaManeger pessoaManager = new PessoaManeger();
		pessoaManager.inicializar();
	    pessoaManager.criar(pessoa);
		listaPessoa = pessoaManager.buscarPessoas();
		pessoaManager.terminar();
		limpar();

	}
	
	public void atualizarPessoa() {
		if(id == null || id == 0 ) {
			System.out.println("Usario não existe e não pde ser atualizado");
			return;
		}
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(id);
		pessoa.setNome(nomeA);
		pessoa.setEndereco(enderecoA);
		pessoa.setNumero(numeroA);
		pessoa.setTelefone(telefoneA);
		pessoa.setCidade(cidadeA);

		PessoaManeger pessoaManager = new PessoaManeger();
		pessoaManager.inicializar();
		pessoaManager.atualizar(pessoa);
		listaPessoa = pessoaManager.buscarPessoas();
		pessoaManager.terminar();
		cancelar();

	}


	public void deletarPessoa(Pessoa p) {
		PessoaManeger pessoaManager = new PessoaManeger();
		pessoaManager.inicializar();
		pessoaManager.deletar(p);
		listaPessoa = pessoaManager.buscarPessoas();
		pessoaManager.terminar();
	}

	public void cancelar() {
		id  = 0;
		nomeA = "";
		enderecoA = "";
		numeroA = "";
		telefoneA = "";
		cidadeA = "";

	}
	
	public void limpar() {
		nome = "";
		endereco = "";
		numero = "";
		telefone = "";
		cidade = "";

	}
	public void alterarPessoa(Pessoa p) {
		nomeA = p.getNome();
		enderecoA = p.getEndereco();
		numeroA = p.getNumero();
		telefoneA = p.getTelefone();
		cidadeA = p.getCidade();
		id = p.getId();
	}

	public List<Pessoa> getListaPessoa() {
		return this.listaPessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setListaPessoa(List<Pessoa> listaPessoa) {
		this.listaPessoa = listaPessoa;
	}


	public String getNomeA() {
		return nomeA;
	}

	public void setNomeA(String nomeA) {
		this.nomeA = nomeA;
	}

	public String getEnderecoA() {
		return enderecoA;
	}

	public void setEnderecoA(String enderecoA) {
		this.enderecoA = enderecoA;
	}

	public String getNumeroA() {
		return numeroA;
	}

	public void setNumeroA(String numeroA) {
		this.numeroA = numeroA;
	}

	public String getTelefoneA() {
		return telefoneA;
	}

	public void setTelefoneA(String telefoneA) {
		this.telefoneA = telefoneA;
	}

	public String getCidadeA() {
		return cidadeA;
	}

	public void setCidadeA(String cidadeA) {
		this.cidadeA = cidadeA;
	}

}
