package edu.gwu.algorithms.asymptotic;

import java.util.ArrayList;
import java.util.List;

public class TCReport {
    // A constant usedin pretty printing.
    private static final String COMMA = ",";

    private static final String NEW_LINE = System.lineSeparator();

    private List<TCObservation> timeObservations = new ArrayList<>();

	public List<TCObservation> getTimeObservations() {
		return timeObservations;
	}

	public void setTimeObservations(List<TCObservation> timeObservations) {
		this.timeObservations = timeObservations;
	}

    public void add(TCObservation tco) {
        timeObservations.add(tco);
    }

    public String prettyPrint() {
        StringBuffer sb = new StringBuffer();
        for (TCObservation tco: timeObservations) {
            sb.append(" " + tco.getInstanceSize() + COMMA + tco.getObservedTimeNanos() / 1000 + NEW_LINE);
        }
        return sb.toString();
    }
}
