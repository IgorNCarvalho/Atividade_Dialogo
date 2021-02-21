
public class Curintiano extends Pessoa{
	
	@Override
	public void dizerola() {
		System.out.println(this.getNome() + ": e aí mano, vai Curintia!");
	}
	
	@Override
	public void saudacao() {
		System.out.println(this.getNome() + ": Tudo tranqs, gente?");
	}
	public void apresentacao() {
		System.out.printf(this.getNome() + ": Me chamo %s, tenho %d anos e sou curintia na veia! e vocês? %n", this.getNome(), this.getIdade());
	}
	public void raiva() {
		System.out.println(this.getNome() + ": Aé! Me espera aqui!");
	}
}
