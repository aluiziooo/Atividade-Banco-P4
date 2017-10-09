package banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class Conta {
	
	private String numConta;
	ArrayList<Lancamento> lancamentos = new ArrayList();
	
	public Conta(){
		
	}
	public Conta(String numConta){
		this.numConta = numConta;
	}
	
	public Conta(String numConta, ArrayList<Lancamento> lancamentos){
		this.numConta = numConta;
		this.lancamentos = lancamentos;
	}
	
	
	public void creditar(float valor){
		Lancamento L = new Lancamento(valor);
		lancamentos.add(L);
	}
	
	public boolean debitar(float valor){
		if(saldo() < 0){
			return false;
		}
		if((saldo() + valor) < 0)
			return false;
		Lancamento L = new Lancamento(valor);
		return true;
	}
	
	public String toString() {
        return "Numero da conta: "+numConta+" Seus Lançamentos: "+lancamentos;
    }
	
	public float saldo(){
		float valor = 0.0f;
		for (Lancamento l : lancamentos) {
			valor += l.getValor();
		}
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Conta){
			Conta conta = (Conta) obj;
			if(this.numConta == conta.getNumConta())
				return true;
		}
		return false;
	}
	
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	
}
