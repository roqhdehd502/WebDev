package fifthWeek.rec;

public class Location {
	private String city; // 도시이름
	private int longitude; // 경도
	private int latitude; // 위도
	
	public Location(String city, int longitude, int latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
}