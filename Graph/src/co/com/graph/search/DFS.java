package co.com.graph.search;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import co.com.graph.product.Edge;
import co.com.graph.product.Node;
import co.com.graph.type.Directed;

public class DFS  implements Search{

	@Override
	public Boolean existRoute(String a, String b) {
		Optional<Node> start = getNode(a);
		Optional<Node> end = getNode(b);
		if (start.isPresent() && end.isPresent()) {
			return existRoute((Node)start.get(),(Node) end.get(), new HashSet<String>());
		} else {
			return false;
		}
	}

	public Boolean existRoute(Node a, Node b, HashSet<String> visited) {
		if (visited.contains(a.getName())) {
			return false;
		}
		visited.add(a.getName());
		if (a == b) {
			return true;
		}
		for (Edge edge : a.getEdges()) {
			Optional<Node> from = getNode(edge.getDestination());
			if(from.isPresent()) {
				if (existRoute((Node) from.get(), b, visited)) {
					return true;
				}
			}
			
		}
		return false;
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

	@Override
	public Boolean existRoute(Node a, Node b) {
		// TODO Auto-generated method stub
		return null;
	}


}
