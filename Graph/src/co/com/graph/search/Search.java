package co.com.graph.search;

import java.util.List;

import co.com.graph.product.Node;

public interface Search {
	public Boolean existRoute(String a, String b); 
	public Boolean existRoute(Node a, Node b);
	public List<Node> searchRoute(String a, String b); 

}
