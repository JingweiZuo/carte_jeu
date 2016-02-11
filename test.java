package tp1_cartejeu;



public class test {
public static void main(String args[]){
	guerriers p1 = new guerriers("Zuo",8,4);
	soigneurs p2 = new soigneurs("Xiong",2);
	paladin p3 = new paladin("Zhao",3,7);
	guerriers p4 = new guerriers("Xu",2,6);
	paladin p5 = new paladin("Jingwei",4,3);
	
	System.out.println("avant le battre");
	System.out.println(p1.allInfo());
	System.out.println(p2.allInfo());
	System.out.println(p3.allInfo());
	System.out.println(p4.allInfo());
	System.out.println(p5.allInfo());

	
	p1.attaquer(p1,p3);
	p1.attaquer(p1,p4);
	p1.attaquer(p1,p5);
	p5.attaquer(p1);
	p4.attaquer(p4,p2);
	p3.Soigner(p3,p4);
	p2.Soigner(p2,p1);
	
	
	System.out.println("après le battre");
	System.out.println(p1.allInfo());
	System.out.println(p2.allInfo());
	System.out.println(p3.allInfo());
	System.out.println(p4.allInfo());
	System.out.println(p5.allInfo());
	
	
	
}

}