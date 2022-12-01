package robot;

import java.util.Random;
import java.util.*;

public class Fighter extends Robot{
	private boolean seed;
	
	public Fighter() {
		super();
	}
	public Fighter(String a, int b) {
		super(a,b);
	}
	
	public void show() {
		System.out.println("Fighter "+this.nom);
	}
	
	Fighter fire(Fighter r) {
		Fighter r2 = new Fighter();
		if(nextBoolean() == true) {
			r.pdv = r.pdv;
			System.out.println(r.nom + " a été raté par "+ this.nom+". vie: "+r.pdv);
		}else if(nextBoolean() == false){
			 r.pdv -= 2;
			 System.out.println(r.nom + " a été touché par "+ this.nom+". vie: "+r.pdv);
		}
		return r;
	}

	private boolean nextBoolean() {
		Random rand = new Random();
		seed = rand.nextBoolean();
		return seed;
	}
	
	public String toString() {
		return "Fighter "+this.nom;
	}
	
	public static void main(String[] args) {
		
		Fighter F1 = new Fighter("jun", 10); 
		Fighter F2 = new Fighter("ruan", 10);
		
		       F1.fire(F2);
	           F2.fire(F1);
			

	}

}
