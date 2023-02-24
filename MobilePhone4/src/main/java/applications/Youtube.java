package applications;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import users.User;

public class Youtube extends Applications {
	private String[] playlist;
	private String[] subscribedChannels;
	private User user;

	public final static Logger LOGGER = LogManager.getLogger(Youtube.class);

	public Youtube(boolean ios, boolean android, int size, String releaseDate, int notifications, String[] playlist,
			String[] subscribedChannels) {
		super(ios, android, size, releaseDate, notifications);
		this.playlist = playlist;
		this.subscribedChannels = subscribedChannels;
	}

	public Youtube(boolean ios, boolean android) {
		super(ios, android);
	}

	public Youtube() {
	}

	public void skipAdvertisment() {
		int timeWatched = 0;
		int timeRemaining = 0;
		if (timeWatched >= 5 && timeRemaining <= 5) {
			skipAdvertisment();
		} else {
			LOGGER.info("Can't skip ad");
		}
	}

	public int fastForward(int time) {
		int currentTime = 0;
		return currentTime + time;
	}

	public void stopVideo(String videoName) {

	}

	public void playVideo(String videoName) {

	}

	public void downloadVideo(String videoName) {

	}

	public void subscribe(String channelName) {

	}

	public void deleteVideo(String videoName) {
		videoName = null;
	}

	public void uploadVideo(String videoName) {

	}

	public String[] getPlaylist() {
		return playlist;
	}

	public void setPlaylist(String[] playlist) {
		this.playlist = playlist;
	}

	public String[] getSubscribedChannels() {
		return subscribedChannels;
	}

	public void setSubscribedChannels(String[] subscribedChannels) {
		this.subscribedChannels = subscribedChannels;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Youtube [playlist=" + Arrays.toString(playlist) + ", subscribedChannels="
				+ Arrays.toString(subscribedChannels) + ", user=" + user + "]";
	}
	

}
