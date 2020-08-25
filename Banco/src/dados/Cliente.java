package dados;

public class Cliente {

	private Integer id;
	//private String nome;
	private String sobrenome;	
	private Integer rg;
	private Integer cpf;
	private Conta conta;		
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Cliente(Integer id, String sobrenome, Integer rg, Integer cpf, Conta conta) {
		super();
		this.id = id;
		//this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
		
	}
		

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public Integer getRg() {
		return rg;
	}



	public void setRg(Integer rg) {
		this.rg = rg;
	}



	public Integer getCpf() {
		return cpf;
	}



	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}



	public Conta getConta() {
		return conta;
	}

	
	@Override
	public String toString() {
		return "Cliente [id: " + id + ", sobrenome=" + sobrenome + ", RG: " + rg + ", CPF: " + cpf + ",\nConta: " + conta
				+ "]";
	}
}
