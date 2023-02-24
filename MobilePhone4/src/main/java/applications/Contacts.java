package applications;

import java.util.List;

import constants.CountryPhoneCodes;
import users.User;

public class Contacts {

	User user;
	CountryPhoneCodes code;
	Integer phoneNumber;

	public Contacts(User user, CountryPhoneCodes code, Integer phoneNumber) {
		this.user = user;
		this.code = code;
		this.phoneNumber = phoneNumber;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "[" + user.getUserName() + ", " + user.getUserAge() + ", " + user.getUserNationality() + ", "
				+ user.getUserAdress() + ", " + "code=" + code.getCountryCode() + ", phoneNumber=" + phoneNumber + "]"
				+ "\n";
	}

}
