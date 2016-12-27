package btcapp;

public class DayTemperature {
	
	private int minTemperature;
	private int maxTemperature;
	private String remarks;
	
	public String getMinTemperature() {
		return minTemperature + " Celcius";
	}
	public void setMinTemperature(int minTemperature) {
		this.minTemperature = minTemperature;
	}
	public String getMaxTemperature() {
		return maxTemperature + " Celcius";
	}
	public void setMaxTemperature(int maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
