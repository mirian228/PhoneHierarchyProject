package applications;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import hardware.Camera;
import interfaces.IMessage;
import users.User;

public class Telegram extends Applications implements IMessage {

	private int numberOfChats;
	private int numberOfChannels;
	private User user;
	private Camera camera;
	private Contacts contacts;

	public final static Logger LOGGER = LogManager.getLogger(Telegram.class);

	public Telegram(boolean ios, boolean android, int size, String releaseDate, int notifications, int numberOfChats,
			int numberOfChannels) {
		super(ios, android, size, releaseDate, notifications);
		this.numberOfChats = numberOfChats;
		this.numberOfChannels = numberOfChannels;

	}

	public Telegram(boolean ios, boolean android) {
		super(ios, android);
	}

	public Telegram() {
	}

	public void createAccount(String userName) {
		if (userName.length() <= 15) {
			user.setUserName(userName);
			LOGGER.info("The account " + user.getUserName() + " has been created.");
		} else {
			LOGGER.info("The permissible length of user name is 15 letters");
		}
	}

	public void takePhoto() {
		camera.takephoto();
	}

	public void search(String input) {

	}

	public void clearDataStorage() {
		LOGGER.info("The storage has been cleared");
	}

	public String changeLanguage(String language) {
		return "The language has been changed to " + language;
	}

	public String saveMessage(String message) {
		return "The message: " + message + " has been saved";
	}

	@Override
	public void sendMessage(String text) {
		LOGGER.info("The message: " + text + " has been sent to " + user + ".");

	}

	public int getNumberOfChats() {
		return numberOfChats;
	}

	public void setNumberOfChats(int numberOfChats) {
		this.numberOfChats = numberOfChats;
	}

	public int getNumberOfChannels() {
		return numberOfChannels;
	}

	public void setNumberOfChannels(int numberOfChannels) {
		this.numberOfChannels = numberOfChannels;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	@Override
	public void clearCache() {
		super.clearCache();
	}

	@Override
	public int getSize() {
		return super.getSize();
	}

	@Override
	public void setSize(int size) {
		super.setSize(size);
	}

	@Override
	public String getReleaseDate() {
		return super.getReleaseDate();
	}

	@Override
	public void setReleaseDate(String releaseDate) {
		super.setReleaseDate(releaseDate);
	}

	@Override
	public boolean isIos() {
		return super.isIos();
	}

	@Override
	public void setIos(boolean ios) {
		super.setIos(ios);
	}

	@Override
	public boolean isAndroid() {
		return super.isAndroid();
	}

	@Override
	public void setAndroid(boolean android) {
		super.setAndroid(android);
	}

	@Override
	public int getNotifications() {
		return super.getNotifications();
	}

	@Override
	public void setNotifications(int notifications) {
		super.setNotifications(notifications);
	}

	@Override
	public String toString() {
		return "Telegram [numberOfChats=" + numberOfChats + ", numberOfChannels=" + numberOfChannels + ", user=" + user
				+ ", camera=" + camera + ", contacts=" + contacts + "]";
	}
}
