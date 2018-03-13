package br.cesed.si.p3.ed.listas.exemplo1;
import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
				
		ArrayList<String> meuAl = new ArrayList<String>();
		meuAl.add("elemento1");
		meuAl.add("elemento2");
		meuAl.add("elemento3");
		meuAl.add("elemento4");
		meuAl.add("elemento5");
		meuAl.add("elemento6");
//		meuAl.add(1);
//		meuAl.add(new Conta(1,1));
		
		meuAl.add(0, "walney");
		
		for (String elen : meuAl) {
			System.out.println(elen);
		}
		
		System.out.println(meuAl.isEmpty());
		System.out.println(meuAl.get(0));
		System.out.println(meuAl.contains("walney"));
		
		meuAl.set(0, "abella");
		
		for (String elen : meuAl) {
			System.out.println(elen);
		}
	} 
}
