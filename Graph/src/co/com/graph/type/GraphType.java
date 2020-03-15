package co.com.graph.type;

import java.util.ArrayList;
import java.util.List;

import co.com.graph.product.Node;

public abstract class GraphType {
	
	private List <Node> nodes;
		
	public abstract void addArc(String from, String to);	
	
	public void addNode(String name) {
		if(nodes == null) {
			 nodes = new ArrayList<>();			
		}
		
		Node node = new Node(name);
		this.nodes.add(node);		
	}
	
	public List<Node> getNodes() {
		return nodes;
	}
	

}
