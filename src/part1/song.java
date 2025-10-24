package part1;

public class song {
	String name;
	String artist;
	int year;

	public song(String n, String a, int y) {
		name = n;
		artist = a;
		year = y;
	}
	public String getName() {
		return name;
	}
	public String getArtist() {
		return artist;
	}
	public int getYear() {
		return year;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAtrist(String a) {
		artist = a;
	}
	public void setYear(int y) {
		year = y;
	}
	@Override
	public String toString() {
		return name + ", " + artist + ", " + year;
	}
}
