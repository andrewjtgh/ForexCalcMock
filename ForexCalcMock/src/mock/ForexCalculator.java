package mock;

public class ForexCalculator {
	private ExchangeRateProvider erp;

	public ForexCalculator(ExchangeRateProvider erp) {
		this.erp = erp;
	}

	public double calc(String source, double amount, String dest) {
		double rate = (double) erp.getRate(source, dest);
		return rate * amount;
	}
}
