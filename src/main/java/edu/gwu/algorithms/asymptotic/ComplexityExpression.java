package edu.gwu.algorithms.asymptotic;

/**
 * An asymptotic complexity expression. *
 * 
 * @author Amrinder Arora
 */
public class ComplexityExpression {
	double exponent;
	double[] logExponents;

    public ComplexityExpression(double exponentArg) {
        this.exponent = exponentArg;
    }

    public double getExponent() {
		return exponent;
	}

	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	public double[] getLogExponents() {
		return logExponents;
	}

	public void setLogExponents(double[] logExponents) {
		this.logExponents = logExponents;
	}
}
