public class main {

	public static void main(String[] args) {

		Pessoa pedro  = new Pessoa();
		pedro.setNome("Pedro Henrique");
		pedro.setIdade(22);
		
		Pessoa priscila  = new Pessoa();
		priscila.setNome("Priscila");
		priscila.setIdade(22);
	
		
		Curintiano gustavo = new Curintiano();
		gustavo.setNome("Gustavo Henrique");
		gustavo.setIdade(26);
		
		
		priscila.dizerOlaParaPessoa(pedro);
		pedro.dizerola();
		priscila.dizerOlaParaPessoa(gustavo);
		gustavo.dizerola();
		gustavo.saudacao();
		pedro.saudacao();
		priscila.saudacao();
		gustavo.apresentacao();
		priscila.apresentacao();
		pedro.apresentacao();
		priscila.sentimento();
		gustavo.raiva();
		priscila.medo();
		pedro.confirmacao();
		
	}

}
