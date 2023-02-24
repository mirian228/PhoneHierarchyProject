package hardware;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Camera {
	private String cameraMp;
	private String cameraZoom;
	private int cameraCount;

	public final static Logger LOGGER = LogManager.getLogger(Camera.class);

	public Camera(String camera_mp, String camera_zoom, int camera_count) {
		this.cameraMp = camera_mp;
		this.cameraZoom = camera_zoom;
		this.cameraCount = camera_count;
	}

	Camera() {
	}

	@Override
	public String toString() {
		return cameraMp + "\n" + cameraZoom + "\n" + cameraCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cameraCount, cameraMp, cameraZoom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camera other = (Camera) obj;
		return cameraCount == other.cameraCount && Objects.equals(cameraMp, other.cameraMp)
				&& Objects.equals(cameraZoom, other.cameraZoom);
	}

	public String getCameraMp() {
		return cameraMp;
	}

	public void setCameraMp(String cameraMp) {
		this.cameraMp = cameraMp;
	}

	public String getCameraZoom() {
		return cameraZoom;
	}

	public void setCameraZoom(String cameraZoom) {
		this.cameraZoom = cameraZoom;
	}

	public int getCameraCount() {
		return cameraCount;
	}

	public void setCameraCount(int cameraCount) {
		this.cameraCount = cameraCount;
	}

	public void takephoto() {
		LOGGER.info("Cheese");
	}

}
