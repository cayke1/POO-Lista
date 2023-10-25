package questao01;

public class Utilitarios {
	public void duplica(Repositorio A, Repositorio B) {
		Pessoa proximo = A.primeiro();
		while(proximo != null) {
			B.guarda(proximo);
			proximo = A.proximo();
		}
	}
	
	public void diferenca(Repositorio A, Repositorio B, Repositorio C) {
		Pessoa proximo = A.primeiro();
		while(proximo != null) {
			String cpf = proximo.getCPF();
			if(B.recupera(cpf) != proximo) {
				C.guarda(proximo);
			}
			proximo = A.proximo();
		}
	}
}
