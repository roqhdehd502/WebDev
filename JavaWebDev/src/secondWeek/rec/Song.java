package secondWeek.rec;

public class Song {
	private int year;
	private String country, artist, songName;
	
	public Song(int year, String country, String artist, String songName) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.songName = songName;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + songName);
		
	}
}