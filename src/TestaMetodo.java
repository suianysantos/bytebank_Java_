
public class TestaMetodo {
 
	public static void main(String[] args) {
	   Conta contaDaSuiany = new Conta();
	   contaDaSuiany.saldo = 100;
	   contaDaSuiany.deposita(50);
		System.out.println(contaDaSuiany.saldo);
		
		boolean conseguiuRetirar = contaDaSuiany.saca(20);
		System.out.println(contaDaSuiany.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(3000,contaDaSuiany)) {
			System.out.println("transferência feita com sucesso");
		}else {
			System.out.println("faltou dinheiro");
			
		}

			
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaSuiany.saldo);
		
}
	}