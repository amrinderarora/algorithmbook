package edu.gwu.algorithms.asymptotic;

public class TCObservation {
    private int instanceSize;
	private double observedTimeNanos;

    public TCObservation(int instanceSize, long observedTimeNanos) {
        this.instanceSize = instanceSize;
        this.observedTimeNanos = observedTimeNanos;
    }

    public int getInstanceSize() {
        return instanceSize;
	}

    public void setInstanceSize(int instanceSize) {
        this.instanceSize = instanceSize;
	}

	public double getObservedTimeNanos() {
		return observedTimeNanos;
	}

	public void setObservedTimeNanos(double observedTimeNanos) {
		this.observedTimeNanos = observedTimeNanos;
	}

}
