package questao02;

import java.util.Stack;

public class CaminhaoBeta implements Caminhao {
	Stack<Pluviometro> pluvs= new Stack<Pluviometro>();
	public CaminhaoBeta() {
		
	}

	@Override
	public void inserePluviometro(Pluviometro p) {
		if(pluvs.empty()) {
			pluvs.push(p);
		} else {
			for(Pluviometro pluv: pluvs) {
				if(pluv.getTipo() == p.getTipo()) {
					return;
				}
			}
			pluvs.push(p);
		}
	}

}
