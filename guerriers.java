package tp1_cartejeu;
import java.util.Random;

public class guerriers extends personnages implements combattre {


	private int pt_attaque;
	private int distance_attaque;
	
	public guerriers(String nom,int pt_attaque,int distance_attaque) {
		
		super(nom);
		this.pt_attaque = pt_attaque;
		this.distance_attaque = distance_attaque;
		
	}
	@Override
	public void attaquer() {
		// TODO Auto-generated method stub
		
	}
	
	public void attaquer(personnages person1 , personnages adver){
		Random rand = new Random();
		int distance = ((java.util.Random) rand).nextInt(5);
		if(distance < this.distance_attaque)
		adver.perdrept(pt_attaque);
		person1.perdrept(pt_attaque);//pour le guerrier,ils peuvent subir eux-memes des dommages lorsqu'ils attaquent 
		}



	}