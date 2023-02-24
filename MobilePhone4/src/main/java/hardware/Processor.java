package hardware;

import java.util.Objects;

import interfaces.IFan;

public class Processor implements IFan {
	private String processorModel;
	private int processorCpuCount;
	private double processorGhz;

	public Processor(String processorModel, int processorCpuCount, double processorGhz) {
		this.processorModel = processorModel;
		this.processorCpuCount = processorCpuCount;
		this.processorGhz = processorGhz;
	}

	public String getProcessorModel() {
		return processorModel;
	}

	public void setProcessorModel(String processorModel) {
		this.processorModel = processorModel;
	}

	public int getProcessorCpuCount() {
		return processorCpuCount;
	}

	public void setProcessorCpuCount(int processorCpuCount) {
		this.processorCpuCount = processorCpuCount;
	}

	public double getProcessorGhz() {
		return processorGhz;
	}

	public void setProcessorGhz(double processorGhz) {
		this.processorGhz = processorGhz;
	}

	@Override
	public void turnFanOn() {

	}

	@Override
	public void turnFanOff() {
	

	}

	@Override
	public String toString() {
		return processorModel + "\n" + processorCpuCount + "\n" + processorGhz;
	}

	@Override
	public int hashCode() {
		return Objects.hash(processorCpuCount, processorGhz, processorModel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processor other = (Processor) obj;
		return processorCpuCount == other.processorCpuCount
				&& Double.doubleToLongBits(processorGhz) == Double.doubleToLongBits(other.processorGhz)
				&& Objects.equals(processorModel, other.processorModel);
	}

}
