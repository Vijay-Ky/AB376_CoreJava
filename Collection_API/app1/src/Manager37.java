import java.util.ArrayList;
import java.util.ListIterator;

public class Manager37 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		ListIterator li = list.listIterator();
		//list.add(50);//use it.add(50) to avoid CuncurrentModificationException
		 li.add(50);
		while (li.hasNext()) {
			System.out.println(li.next() + ",");
		}
		System.out.println("--------------------------");
		while (li.hasPrevious()) {
			System.out.println(li.previous() + ",");
		}
		list.add(200);
		System.out.println(list);
		
	}
}
