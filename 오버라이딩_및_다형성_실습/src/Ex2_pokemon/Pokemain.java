package Ex2_pokemon;

public class Pokemain {
	public static void main(String[] args) {
		Monster m1 = new Monster();
		m1.name = "피카츄";
		m1.type = "전기";
		m1.Mypokemon();
		
		Monster m2 = new Monster();
		m2.name = "파이리";
		m2.type = "불";
		m2.Mypokemon();
		
		Monster m3 = new Monster();
		m3.name = "꼬부기";
		m3.type = "물";
		m3.Mypokemon();

	}
}
