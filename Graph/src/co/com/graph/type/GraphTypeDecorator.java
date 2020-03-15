package co.com.graph.type;


public abstract class GraphTypeDecorator extends GraphType{
	
	protected final GraphType graphTypeToBeDecorated;

	public GraphTypeDecorator(GraphType graphType) {
		this.graphTypeToBeDecorated = graphType;
	}

	@Override
	public void addArc(String from, String to) {
		this.graphTypeToBeDecorated.addArc(from, to);
	}
}
