package co.com.graph.type;

import java.util.ArrayList;
import java.util.List;

import co.com.graph.product.Edge;
import co.com.graph.product.Node;

public class Undirected extends GraphType{

	@Override
	public void addArc(String from, String to) {
		Node node = this.getNodes().stream().filter((n) -> n.getName().equals(from)).findAny().orElse(null);
		List <Edge> edges;
		if(node != null) {
			if(node.getEdges() == null) {
				edges =  new ArrayList<>();
			}else {
				edges = node.getEdges();
			}
			Edge edge = new Edge(from,to);
			edges.add(edge);			
		}
		
		//bi-direccional
		addArc(to, from);		
		
	}

}
