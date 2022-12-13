package applications;

public abstract class Applications {
	private boolean ios;
	private boolean android;
	private int size;
	private String releaseDate;
	private int notifications;
	
	
	
	
	public Applications(boolean ios, boolean android, int size, String releaseDate, int notifications) {
		this.ios = ios;
		this.android = android;
		this.size = size;
		this.releaseDate = releaseDate;
		this.notifications = notifications;
	}
	public Applications(boolean ios, boolean android) {
		this.ios = ios;
		this.android = android;
	}
	
	public Applications() {
		
	}
	


	public void clearCache() {
		}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isIos() {
		return ios;
	}


	public void setIos(boolean ios) {
		this.ios = ios;
	}


	public boolean isAndroid() {
		return android;
	}


	public void setAndroid(boolean android) {
		this.android = android;
	}
	public int getNotifications() {
		return notifications;
	}
	public void setNotifications(int notifications) {
		this.notifications = notifications;
	}
	
	
}

  