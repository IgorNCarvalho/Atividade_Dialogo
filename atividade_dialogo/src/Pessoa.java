
public class Pessoa {
		private int idade;
		private String nome;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public void dizerola() {
			System.out.println(this.nome + ": Olá!");
		}
		public void dizerOlaParaPessoa(Pessoa pessoa) {
			System.out.println(this.nome + ": Olá! " + pessoa.getNome());
		}
		public void saudacao() {
			System.out.println(this.nome + ": Tudo bem!");
		}
		public void apresentacao() {
			System.out.printf(this.nome + ": Me chamo %s e tenho %d! %n", this.nome , this.idade);
		}
		public void sentimento() {
			System.out.println(this.nome + ": Sinto muito pelo seu time! Infelizmente nem todos sabem escolher bons times...");
		}
		public void medo() {
			System.out.println(this.nome + ": Vamos correr!! Ele está armado!!");
		}
		public void confirmacao() {
			System.out.println(this.nome + ": Corre!!!");
		}
}
