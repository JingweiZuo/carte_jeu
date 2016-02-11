package tp1_cartejeu;

import java.util.Random;

public class paladin extends personnages implements combattre, soigner {

	int pt_soin ;
	int distance_soin;
	private int pt_attaque;
	@Override
	public void Soigner() {
		// TODO Auto-generated method stub

	}
	
	public void Soigner (paladin pA ,personnages pB){
		Random rand = new Random();
		int distance = ((java.util.Random) rand).nextInt(5);
		if(distance < this.distance_soin){
			
			pB.gagnerpt(pt_soin);
			pA.perdrept(pt_soin);
		}
	}	

	@Override
	public void attaquer() {
		// TODO Auto-generated method stub

	}
	
	public void attaquer(personnages adver){
		adver.perdrept(pt_attaque);
		
	}
	
	public paladin(String nom,int pt_attaque, int pt_soin) {
		super(nom);
		this.pt_attaque = pt_attaque;
		this.pt_soin = pt_soin;
		// TODO Auto-generated constructor stub
}
}





