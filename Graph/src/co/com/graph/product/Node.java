package co.com.graph.product;

import java.util.List;

public class Node {
	private String name;
	protected List <Edge> edges;
	
	public Node (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Edge> getEdges() {
		return edges;
	}

}
