package graphtest.core;

public class Edge {

	private Node toNode;
	private Node fromNode;

	private String name;
	private int value;

	public Edge(String name, Node fromNode, Node toNode, int value) {
		super();
		this.toNode = toNode;
		this.fromNode = fromNode;
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Edge [toNode=" + toNode.getName() + ", fromNode=" + fromNode + ", name=" + name + ", value=" + value + "]";
	}

	public String toCytoscapeString() {

		String ret = "{ data: { id: '" + name + " source: " + fromNode.getName() + ", target: " + toNode.getName() + "}" + " } }"
		;

		return ret;
	}

}
