package robot;

public class Arena extends Robot{
	
	Robot r1, r2;
	
	public Arena() {}
	public Arena(Robot a, Robot b) {
		this.r1 = a;
		this.r2 = b;
	}
	
	public void figth(Robot r1, Robot r2) {
		while(r2.pdv!=0) {
				r1.fire(r2);
				if(r2.pdv != 0) {
				   r2.fire(r1);
				}else {
					isDead(r2);
					System.out.println("combat termine. "+r1.nom+" est victorieux");
				}
			
		}
		
		 
	}
	public String toString() {
		return " Combat d'arène";
	}

	public static void main(String[] args) {
		Robot r1 = new Robot("maitre",10);
		Robot r2 = new Robot("eleve", 10);
		Arena A = new Arena(r1, r2);
		
		A.figth(r1, r2);
		
		

	}

}
