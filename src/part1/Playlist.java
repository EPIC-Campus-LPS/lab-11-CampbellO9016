package part1;

public class Playlist {
	
	private String name;
	private song songs[];
	
	public Playlist(String n, song[] s) {
		name = n;
		songs = s;
	}
	public String getName() {
		return name;
	}
	public song[] getSongs() {
		return songs;
	}
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < 5; i ++) {
			str += i +1 + ": " + songs[i];
			str += "\n";
		}
//		System.out.println(str);
		return str;
	}
		
}
