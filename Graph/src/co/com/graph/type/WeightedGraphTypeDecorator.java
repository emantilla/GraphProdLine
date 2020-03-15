package co.com.graph.type;

import co.com.graph.product.Edge;
import co.com.graph.product.Node;

public class WeightedGraphTypeDecorator extends GraphTypeDecorator {

	public WeightedGraphTypeDecorator(GraphType graphType) {
		super(graphType);
	}
	
	@Override
	public void addArc(String from, String to) {
		super.addArc(from, to);
	}
	
	public void addArc(String from, String to, int weight) {
		this.addArc(from, to);
		if(this.graphTypeToBeDecorated instanceof Directed) {
			this.addWeight(from, to, weight);
			
		}else if(this.graphTypeToBeDecorated instanceof Undirected) {
			this.addWeight(from, to, weight);
			this.addWeight(to, from, weight);		
		}
		
	}
	
	private void addWeight(String from, String to, int weight) {
		Node node = this.graphTypeToBeDecorated.getNodes().stream()
				.filter((n) -> n.getName().equals(from)).findAny()
				.orElse(null);
		
		if(node !=null) {
			Edge edge = node.getEdges().stream()
					.filter(e -> e.getOrigin().equals(from) && e.getDestination().equals(to))
					.findAny()
					.orElse(null);
			if(edge != null) {
				edge.setWeight(weight);
			}			
		}
		
		
	}

}
