package users;

import java.util.Objects;

public class User {
	private String userName;
	private int userAge;
	private String userNationality;
	private String userAdress;
	
	
	public User(String userName, int userAge, String userNationality, String userAdress){
		this.userName = userName;
		this.userAge = userAge;
		this.userNationality = userNationality;
		this.userAdress = userAdress;
		}
	
	public User(){
		userName = "Blank";
		userAge = 0;
		userNationality = "C";
		userAdress = "Street";
	}

	
	
	
	
	@Override
	public String toString() {
		return userName + "\n" + userAge + "\n" + userNationality + "\n" + userAdress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userAdress, userAge, userName, userNationality);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userAdress, other.userAdress) && userAge == other.userAge
				&& Objects.equals(userName, other.userName) && Objects.equals(userNationality, other.userNationality);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserNationality() {
		return userNationality;
	}

	public void setUserNationality(String userNationality) {
		this.userNationality = userNationality;
	}

	public String getUserAdress() {
		return userAdress;
	}

	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}

}
