package robot;

public class  Robot {
	protected int pdv;
	protected String nom;
	
	public Robot() {
		this.pdv = 10;
		this.nom = "";
	}
	
	public Robot(String b, int a) {
		this.nom = b;
		this.pdv= a;
	}
	public Robot(String a) {
		this.nom = a;
	}
	
	public int getPdv() {return pdv;}
	public String getNom() {return nom;}
	
	public void setPdv(int a) {
		this.pdv = a;
	}
	public void setNom(String b) {
		this.nom = b;
	}
	
	public String toString() {
		return "Robot "+this.nom;
	}
	
    Robot fire(Robot r) {
    	Robot r2 = new Robot();
    	
    	if(!isDead(r)) {
		r.pdv -= 2;
		System.out.println(r.nom + " a été touché par "+ this.nom+". vie: "+r.pdv);
    	}
		return r;
	}
	
	public  boolean isDead(Robot r) {
		if(r.pdv == 0) {
			System.out.println(r.nom + " est mort");
			return true;
		}
		return false;
	}
	
	public void show() {
		System.out.println("Robot "+this.nom);
	}

	public static void main(String[] args) {
		Robot bob = new Robot("bob", 10);
		Robot rex = new Robot("rex", 10);
		
		bob.show();
		rex.show();
		
		bob.fire(rex);
		

	}

}
