package constants;

public enum CountryPhoneCodes {
	GEORGIA("+995"),
	BELARUS("+375"),
	UNITEDSTATES("+1"),
	POLAND("+48"),
	TURKEY("+90"),
	UKRAINE("+380"),
	GERMANY("+49");
	
	final String countryCode;
	
	
	CountryPhoneCodes(String countryCode){
	this.countryCode = countryCode;	
	}


	public String getCountryCode() {
		return countryCode;
	}
	
	

}
