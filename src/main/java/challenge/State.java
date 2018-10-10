package main.java.challenge;

public class State {
	
	private String uf;
	private String name;
	
	public State(String uf, String name){
		this.uf = uf;
		this.name = name;
	}

	public String getUf() {
		return this.uf;
	}

	public String getName() {
		return this.name;
	}

}