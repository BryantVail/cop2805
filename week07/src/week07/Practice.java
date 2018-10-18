package week07;

public class Practice {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		
		list.add(12);
		list.add(56);
		list.add(58);
		list.add(84);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.delete(1);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
