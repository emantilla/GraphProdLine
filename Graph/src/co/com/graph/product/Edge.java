package co.com.graph.product;

public class Edge {
	private String origin;
	private String destination;
	private int weight;
	
	public Edge(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}
	
	public Edge(String origin, String destination, int weight) {
		this.origin = origin;
		this.destination = destination;
		this.weight = weight;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
