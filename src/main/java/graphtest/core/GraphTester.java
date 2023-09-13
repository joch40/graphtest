package graphtest.core;

public class GraphTester {

	public static void main(String[] args) {
		
		
		Node n1 = new Node ("n1");
		Node n2 = new Node ("n2");
		Node n3 = new Node ("n3");
		Node n4 = new Node ("n4");
		Node n5 = new Node ("n5");
		Node n6 = new Node ("n6");
		
		Edge e1 = new Edge("e1",n1,n2,1);
		Edge e2 = new Edge("e2",n1,n3, 1);
		Edge e3 = new Edge("e3",n3,n4, 1);
		Edge e4 = new Edge("e4",n2,n5, 1);
		Edge e5 = new Edge("e6",n2, n6, 1);
		
		Graph myGraph = new Graph();
		
		myGraph.addNode(n1);
		myGraph.addNode(n2);
		myGraph.addNode(n3);
		myGraph.addNode(n4);
		myGraph.addNode(n5);
		myGraph.addNode(n6);
		
		myGraph.addEdge(e1); 
		myGraph.addEdge(e2);
		myGraph.addEdge(e3);
		myGraph.addEdge(e4);
		myGraph.addEdge(e5);
		
		String ausgabe = myGraph.toCytoscapeString();
		System.out.println(" Ausgabe: ");
		System.out.println(ausgabe);
		
		
		

	}

}
