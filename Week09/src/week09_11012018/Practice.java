package week09_11012018;

import java.util.ArrayList;

public class Practice {
	
	public static void main(String[] args) {
		Node n1 = new Node(105);
		Node n2 = new Node(110);
		Node n3 = new Node(117);
		Node n4 = new Node(111);
		Node n5 = new Node(131);
		Node n6 = new Node(133);
		Node n7 = new Node(129);
		Node n8 = new Node(100);
		
	}
	
	
	class Node {
		public int data;
		public ArrayList<Node> children = new ArrayList<>();
		
		public Node(int data, Node...nodes) {
			this.data = data;
			for(Node node : nodes) {
				children.add(node);
			}
		}
	}

}
