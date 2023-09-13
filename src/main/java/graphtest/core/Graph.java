package graphtest.core;

import java.util.ArrayList;
import java.util.Iterator;

public class Graph {

	private ArrayList<Node> myNodes;
	private ArrayList<Edge> myEdges;

	public Graph() {
		super();

		myNodes = new ArrayList<Node>();
		myEdges = new ArrayList<Edge>();
	}

	public void addNode(Node n) {
		myNodes.add(n);
	}

	public void addEdge(Edge e) {
		myEdges.add(e);

	}

	public String toCytoscapeString() {
		// rückgabewert
		StringBuffer sb = new StringBuffer();
		// lauf variablen
		Node n;
		Edge e;
		// los gehts

		sb.append("  nodes: [ ");
		// Nodes
		Iterator<Node> iterNodes = myNodes.iterator();
		while (iterNodes.hasNext()) {
			n = iterNodes.next();
			sb.append(n.toCytoscapeString());
			// Wenn nicht letzter noch ein Komma anhängen
			if (iterNodes.hasNext()) {
				sb.append(",");
			}
		}
		// Übergang Nach dem alle Nodes raus sind.
		sb.append(" ],  edges: [ ");

		// Edges
		Iterator<Edge> iterEdges = myEdges.iterator();

		while (iterEdges.hasNext()) {
			e = iterEdges.next();
			sb.append(e.toCytoscapeString());
			if (iterEdges.hasNext()) {
				sb.append(",");
			}
		}
		// Ende

		sb.append("  ] ");
		return sb.toString();
	}

}
