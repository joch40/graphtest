package graphtest.core;

public class Node {

	private String name;
	private int posx;
	private int posy;

	// etc...

	public Node(String name) {
		super();
		this.name = name;
		posx = 0;
		posy = 0;
	}
	
	

	public Node(String name, int posx, int posy) {
		super();
		this.name = name;
		this.posx = posx;
		this.posy = posy;
	}



	
	@Override
	public String toString() {
		return "Node [name=" + name + ", posx=" + posx + ", posy=" + posy + "]";
	}



	public String toCytoscapeString() {

		String ret = "{ data: { id: '" + name + "  } } ";

		return ret;
	}



	public String getName() {
		return name;
	}

}
