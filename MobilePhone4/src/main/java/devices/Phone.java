package devices;

import java.util.Objects;
public abstract class Phone {
	private final String brand;
	private final String model;
	private final String weight;
	private final String dimensions;
	private String displayType;
	private String displaySize;
		
	

	
		Phone(String brand, String model, String weight, String dimensions) {
		
		this.brand = brand;
		this.model = model;
		this.weight = weight;
		this.dimensions = dimensions;
		
		
		}	
		Phone(String brand, String model, String weight, String dimensions, String displayType, String displaySize) {
		
		this.brand = brand;
		this.model = model;
		this.weight = weight;
		this.dimensions = dimensions;
		this.displayType = displayType;
		this.displaySize = displaySize;
		
		}
	
	
	@Override
	public String toString() {
		return brand + "\n" + model + "\n" + weight + "\n" + dimensions + "\n" + displayType + "\n" + displaySize;
	}
	
	
	
	



	@Override
	public int hashCode() {
		return Objects.hash(brand, dimensions, displaySize, displayType, model, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(dimensions, other.dimensions)
				&& Objects.equals(displaySize, other.displaySize) && Objects.equals(displayType, other.displayType)
				&& Objects.equals(model, other.model) && Objects.equals(weight, other.weight);
	}


	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}

	public String getWeight() {
		return weight;
	}
	
	public String getDimensions() {
		return dimensions;
	}
	



	public String getDisplayType() {
		return displayType;
	}



	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}



	public String getDisplaySize() {
		return displaySize;
	}



	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	
	
	

	
}
