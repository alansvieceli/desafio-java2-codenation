package main.java.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public List<State> listThe10largestStatesInBrazil() {
		List<State> state = new ArrayList<State>();
		state.add(new State("AM", "Amazonas"));
		state.add(new State("PA", "Pará"));
		state.add(new State("MT", "Mato Grosso"));
		state.add(new State("MG", "Minas Gerais"));
		state.add(new State("BA", "Bahia"));
		state.add(new State("MS", "Mato Grosso do Sul"));
		state.add(new State("GO", "Goiás"));
		state.add(new State("MA", "Maranhão"));
		state.add(new State("RS", "Rio Grande do Sul"));
		state.add(new State("TO", "Tocantins"));		
		return state;
	}

}
