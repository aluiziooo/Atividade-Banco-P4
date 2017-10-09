package banco;

import java.util.Collection;
import java.util.Date;

/**
 * @author Neto
 *
 */

public class Lancamento {
	private Date data;
	private double valor;
	
	
	public Lancamento(double valor){
		Date D = new Date();
		this.data = D;
		setValor(valor);
	}

	public String toString() {
        return "Data: "+this.data+" | Valor do lançamento: "+this.valor;
    }
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	

}