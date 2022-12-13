package applications;

import users.User;

public class Facebook extends Applications {
	private int friends;
	private User user;
	

	public Facebook(boolean ios, boolean android, int size, String releaseDate, int notifications, int friends) {
		super(ios, android, size, releaseDate, notifications);
		this.friends = friends;
		
	}

	public Facebook() {
		super();
		
	}
	
	public void addFriend() {
		friends++;
	}
	
	public void removeFriend() {
		friends--;
	}
	
	public void createPost(String postName, String text) {
		
	}
	
	public void removePost(String postName) {
		postName = null;
	}

	public Facebook(boolean ios, boolean android) {
		super(ios, android);
		}



	public int getFriends() {
		return friends;
	}



	public void setFriends(int friends) {
		this.friends = friends;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}





	
	
	
}
