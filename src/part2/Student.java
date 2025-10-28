package part2;

public class Student {
	
	private String stuNumber;
	private String name; 
	private int math;
	private int sci;
	private int his;
	private int eng;
	private int cs;

	public Student(String sn, String n, int m, int s, int h, int e, int c) {
		stuNumber = sn;
		name = n;
		math = m;
		sci = s;
		his = h;
		eng = e;
		cs = c;
	}
	
	public String getStuNumber() {
		return stuNumber;
	}
	public String getName() {
		return name;
	}
	public int getMath() {
		return math;
	}
	public int getScience() {
		return sci;
	}
	public int getHistory() {
		return his;
	}
	public int getEnglish() {
		return eng;
	}
	public int getCS() {
		return cs;
	}
	
}
