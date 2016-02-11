package tp1_cartejeu;
import java.util.Random;

public class soigneurs extends personnages implements soigner {
	
	int pt_soin ;
	int distance_soin;
	@Override
	public void Soigner() {
		// TODO Auto-generated method stub

	}
	
	public soigneurs(String nom, int pt_soin) {
		super(nom);
		this.pt_soin = pt_soin;
		// TODO Auto-generated constructor stub
	}

	public void Soigner (soigneurs pA ,personnages pB){
		Random rand = new Random();
		int distance = ((java.util.Random) rand).nextInt(5);
		if(distance < this.distance_soin){
			
			pB.gagnerpt(pt_soin);
			pA.perdrept(pt_soin);
		}
	}	
}
	








	
	
	