package co.com.graph.search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import co.com.graph.product.Edge;
import co.com.graph.product.Node;
import co.com.graph.type.Directed;

public class BFS implements Search {

	@Override
	public Boolean existRoute(String a, String b) {
		Optional<Node> start = getNode(a);
		Optional<Node> end = getNode(b);
		if (start.isPresent() && end.isPresent()) {
			return existRoute((Node)start.get(),(Node) end.get());
		} else {
			return false;
		}
	}

	public Boolean existRoute(Node a, Node b) {
		LinkedList<Node>  nextToVisit = new LinkedList<Node>();
		HashSet<String> visited = new HashSet<>(); 
		nextToVisit.add(a);
		
		while(!nextToVisit.isEmpty()) {
			Node node = nextToVisit.remove();
			
			if(node.getName().equals(b.getName())) {
				return Boolean.TRUE;
			}
			
			if (visited.contains(node.getName())) {
				continue;
			}
			visited.add(node.getName());
			
			for(Edge edge:node.getEdges()) {
				Optional<Node> temp = getNode(edge.getDestination());
				if(temp.isPresent()) {
					nextToVisit.add((Node) temp.get());
				}				
			}				
		}
		return Boolean.FALSE;
	}

	private Optional<Node> getNode(String name) {
		Directed graph = new Directed();
		List<Node> nodes = graph.getNodes();
		for (Node node : nodes) {
			if (node.getName().equals(name)) {
				return Optional.of(node);
			}
		}
		return Optional.empty();
	}

	@Override
	public List<Node> searchRoute(String a, String b) {
		return null;
	}

}
