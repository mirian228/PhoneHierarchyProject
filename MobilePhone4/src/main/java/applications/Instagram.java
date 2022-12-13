package applications;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Instagram extends Applications {

	private int followers;
	private int following;
	private int posts;
	private String bio;

	public Instagram(boolean ios, boolean android, int size, String releaseDate, int notifications, int followers,
			int following, int posts, String bio) {
		super(ios, android, size, releaseDate, notifications);
		this.followers = followers;
		this.following = following;
		this.posts = posts;
		this.bio = bio;
	}

	public Instagram(boolean ios, boolean android) {
		super(ios, android);

	}

	public Instagram() {
		super();

	}

	public final static Logger LOGGER = LogManager.getLogger(Instagram.class);

	// throws
	public void follow(String username) throws NullPointerException {
		try {
			if (username == null)
				;
		} catch (NullPointerException e) {
			LOGGER.info("post name can't be null");
		}
	}

	// throws
	public void deletePost(String postName) throws NullPointerException {
		try {
			if (postName == null)
				;
		} catch (NullPointerException e) {
			LOGGER.info("post name can't be null");
		}
	}

	public void unfollow(String username) {
		LOGGER.info("The user: " + username + " has been unfollowed.");
	}

	public void createPost(String text, String postName) {
		LOGGER.info(text);
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public int getPosts() {
		return posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

}
