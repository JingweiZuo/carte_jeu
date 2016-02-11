package tp1_cartejeu;
import java.util.Random;

public abstract class personnages {

	/**
	 * @param args
	 */
	int distance;
	private String nom;
	private int pt_vie;
	
	
	String message;
	
	public personnages(){};
	
	public personnages(String nom){
		
		this.nom=nom;
		Random rand = new Random();
		this.pt_vie = rand.nextInt(250);
	}
	
	public void gagnerpt(int point){
		this.pt_vie += point;
	}
	
	public void perdrept(int point){
		this.pt_vie -= point;
	}
	
	
	public String allInfo(){
		
		return "type:"+getClass().getName() +"name:" +this.nom +"pt_vie:" +this.pt_vie;
	}
	
}


