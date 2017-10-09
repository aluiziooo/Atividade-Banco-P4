package banco;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenaPorSaldo implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		ArrayList<Lancamento> L1 =  o1.lancamentos;
		ArrayList<Lancamento> L2 =  o2.lancamentos;
		
		float saldo1 = 0.0f;
		float saldo2 = 0.0f;
		
		for (Lancamento l1 : L1) {
			saldo1 += l1.getValor();
		}
		for(Lancamento l2 : L2){
			saldo2 += l2.getValor();
		}
		
		if(saldo1 < saldo2) return -1;
		if(saldo1 > saldo2) return 1;
		if(saldo1 == saldo2) 
			return 0;
		return 0;
	}

}
