import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {

//		duplicateWords("Je ne ne ne vais pas pas me laisser faire");
//		duplicateChars("milouuuu youhou");
		getTableau();
//		duplicateNumbers(77729887);

	}

	/**
	 *  affiche les mots apparaissant plus d'une fois dans la phrase 
	 */
	private static void duplicateWords(String string) {
		
		String[] tab = string.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		
		for (String temp:tab) {

			if (hm.get(temp)!=null) {
				hm.put(temp, hm.get(temp)+1);
			} else {
				hm.put(temp, 1);
			}
			//System.out.println(temp+" "+hm.get(temp));
		}
		
		/*Ne fonctionnent pas avec des String, car réordonne
		 * 
		 * for (String key : hm.keySet()) { System.out.println("Le mot '" + key +
		 * "' apparait: " + hm.get(key) + " fois"); }

		 * for (Map.Entry<String, Integer> e : hm.entrySet()) {
		 * System.out.println("Le mot '" + e.getKey() + "' apparait: " + e.getValue() +
		 * " fois"); }
		 */
		
//		Iterator<String> ikey = hm.keySet().iterator();
//		while (ikey.hasNext()) {
//			String istr = ikey.next();
//			System.out.println("Le mot '" + istr + "' apparait: " + hm.get(istr) + " fois"); 
//		}
		
		 for (String key : hm.keySet()) { 
			 if (hm.get(key)>1) 
				 System.out.println("Le mot '" + key +
		 "' apparait: " + hm.get(key) + " fois"); }

	}
	
	/**
	 *  affiche les caractères apparaissant plus d'une fois dans le mot
	 */
	private static void duplicateChars(String string) {
		
		char[] tab = string.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for (char c:tab) {

			if (hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, 1);
			}
			//System.out.println(c+" "+hm.get(c));
		}
		
	
		 for (char key : hm.keySet()) { 
			 if (hm.get(key)>1) 
				 System.out.println("La lettre '" + key +
		 "' apparait: " + hm.get(key) + " fois"); }

	}
	
	/**
	 * convertit un String entré en tableau de int 
	 */
	public static void getTableau() {
		int tab[]=null;
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		tab=new int[x.length()];
		 
		for (int i = 0; i < tab.length; i++) {
		    tab[i]=x.charAt(i)-'0'; // pas compris pq le -'0'
			System.out.println(x.charAt(i)+" "+tab[i]);
		}
	}
	/**
	 *  affiche les chiffres apparaissant plus d'une fois dans le nombre
	 */
	private static void duplicateNumbers(int n) {
		
		
		String str = Integer.toString(n);
		char[] tab = str.toCharArray();
		//int longueur = str.length();
		HashMap<Character,Integer> hm = new HashMap<>();
			
		for (char c:tab) {

			if (hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, 1);
			}
			//System.out.println(c+" "+hm.get(c));
		}
		
	
		 for (char key : hm.keySet()) { 
			 if (hm.get(key)>1) 
				 System.out.println("Le chiffre '" + key +
		 "' apparait: " + hm.get(key) + " fois"); }

	}
}
