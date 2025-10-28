package part2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class StudentRunner {

	public static void main(String[] args) throws IOException {
//		File file = new File("roster.csv");
//		Scanner scan = new Scanner(files);
		String line = "";
		String IDtemp = "";
		String ntemp = "";
		int mtemp = 0;
		int stemp = 0;
		int htemp = 0;
		int etemp = 0;
		int ctemp = 0;
		int count2 = 0;
		Student[] students = new Student[16];
		boolean yes = false;
		File folder = new File("student_grades");
		File[] files = folder.listFiles();
		
		for(File f: files) {
			int count = 0;
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				if(count == 0) {
					IDtemp = line.substring(0,4);
					ntemp = line.substring(7);					
				}
				if(count == 1) {
					mtemp = Integer.valueOf(line.substring(7));
				}
				if(count == 2) {
					stemp = Integer.valueOf(line.substring(10));
				}
				if(count == 3) {
					htemp = Integer.valueOf(line.substring(10));
				}
				if(count == 4) {
					etemp = Integer.valueOf(line.substring(10));
				}
				if(count == 5) {
					ctemp = Integer.valueOf(line.substring(19));
					yes = true;
				}
				if(yes) {
					Student s = new Student(IDtemp, ntemp, mtemp, stemp, htemp, etemp, ctemp);
					students[count2] = s;
					yes = false;
					count2 ++;
				}
				count ++;
			}
		}
		double mave = 0;
		double save = 0;
		double have = 0;
		double eave = 0;
		double cave = 0;
		for(Student s: students) {
			mave += s.getMath();
			save += s.getScience();
			have += s.getHistory();
			eave += s.getEnglish();
			cave += s.getCS();
		}
		mave /= 16;
		save /= 16;
		have /= 16;
		eave /= 16;
		cave /= 16;
		
		
		System.out.println("Average Math Grade: " + mave);
		System.out.println("Average Science Grade: " + save);
		System.out.println("Average Math Grade: " + have);
		System.out.println("Average Math Grade: " + eave);
		System.out.println("Average Math Grade: " + cave);
		
//		scan.close();
	}

}
