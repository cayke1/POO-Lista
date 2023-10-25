package questao02;

import java.util.Stack;

public class CaminhaoAlfa implements Caminhao {
	Stack<Pluviometro> pluvs= new Stack<Pluviometro>();
	public CaminhaoAlfa() {
		
	}

	@Override
	public void inserePluviometro(Pluviometro p) {
		if(p.getPeso() <= 5000) {
			pluvs.push(p);
		}
	}
	

}
