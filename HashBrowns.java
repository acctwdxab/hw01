package quintrix01;
import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("kitty");
		h.add("chickens");
		h.add("doggie");
		h.add("silkie");
		
//		
//		System.out.println(h);
//		System.out.println(h.size());
//		System.out.println(h.isEmpty());
//		System.out.println(h.contains("lily"));
		
		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		hashbrowns.add(13);
		hashbrowns.add(10);
		hashbrowns.add(15);
		hashbrowns.add(14324);
		
		Iterator<Integer> it = hashbrowns.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		

	}

}
