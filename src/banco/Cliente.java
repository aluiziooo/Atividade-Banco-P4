package banco;

public class Cliente {
	private String CPF;
	private String nome;
	
	public Cliente(){
		
	}
	
	public Cliente(String CPF, String Nome){
		this.CPF = CPF;
		this.nome = Nome;
	}
	
	@Override
    public String toString() {
        return "Nome do cliente: "+nome+"CPF: "+CPF;
    }
	
	
	
	
	
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
