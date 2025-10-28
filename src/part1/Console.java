package part1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Console {
// Make change 
	public static void main(String[] args) throws IOException{
		File file = new File("playlist.txt");
		Scanner scan1 = new Scanner(file);
		String line = "";
		int count = 0;
		song[] nsg = new song[5];
		Playlist[] playlists = new Playlist[10];
		 int count1 = 0;
		 int count3 = 0;
		 String l = "";

		while(scan1.hasNextLine()) {	
			 boolean tf = false;
			 line = scan1.nextLine();
			 if(!(line.substring(0).equals("")) && !(line.substring(0, 1).equals("P")) ){
				 String[] s = line.split(", ");	
				 String nm = s[0];
				 String at = s[1];
				 int yr = Integer.valueOf(s[2]);
				 song sg = new song(nm, at, yr);
				 nsg[count] = sg;
				 count ++;
//				 for(song i: nsg) {
//					 System.out.println(i);
//				 }
			 }
			 else if(!(line.substring(0).equals("")) && (line.substring(0, 1).equals("P"))){
				 
				 if((count3 != 0)) {
					 if(count3 % 7 == 0) {
//						 System.out.println("run");
						 Playlist p = new Playlist(l, nsg.clone());
						 playlists[count1] = p; 
						 count1 ++;
						 for(int i = 0; i < 5; i ++) {
							 nsg[i] = null;
						 }
						 count = 0;
					 }
//					 else if(count3 == 14) {
//						 System.out.println("run");
//						 Playlist p = new Playlist(l, nsg.clone());
//						 playlists[count1] = p; 
//						 count1 ++;
//						 for(int i = 0; i < 5; i ++) {
//							 nsg[i] = null;
//						 }
//						 count = 0;
//					 }
//					 else {
//						 Playlist p = new Playlist(line, nsg.clone());
//						 playlists[count1] = p; 
//						 count1 ++;
//						 for(int i = 0; i < 5; i ++) {
//							 nsg[i] = null;
//						 }
//						 count = 0;
//					 }
					 
				 }
				 l = line;

				 
			 }
			 count3 ++;
//			 System.out.println(count3);
		}
		
		Scanner scan = new Scanner(System.in);
		Scanner scanin = new Scanner(System.in);
		boolean t = true;
		while(t) {
			System.out.println("\n________________________________________________________________");
			System.out.println("Playlist Viewer Menu\r\n"
					+ "(A) View List of Playlists\r\n"
					+ "(B) View a Playlist\r\n"
					+ "(C) Search Songs\r\n"
					+ "(D) Modify a Playlist");
			System.out.print("\nSelect a mode: ");
			String inp = scan.nextLine();
			inp = inp.toUpperCase();
			if(inp.equals("A")) {
				System.out.println("\nYour Playlists: \n");
				for(Playlist i: playlists) {
					 System.out.println(i.getName());
				 }
			}
			else if(inp.equals("B")) {
				System.out.println("Which playlist would you like to view: ");
				int b = scanin.nextInt();
				b --;
				System.out.println(playlists[b].getName());
				System.out.println(playlists[b]);
				//fix double printing of the main menu and finish b and c
			}
			else if(inp.equals("C")) {
				System.out.println("What would you like to search by?\n"
						+ "(A) Artist\n"
						+ "(B) Year");
				System.out.println("Select a mode:");
				String i = scan.nextLine(); 
				i = i.toUpperCase();
				if(i.equals("A")) {
					boolean yes = false;
					System.out.println("What artist would you like to search: ");
					String i1 = scan.nextLine();
					System.out.println("Songs by "+i1 + "\n");
					for(int j = 0; j < playlists.length; j ++) { 
						song[] s = new song[5];
						s = playlists[j].getSongs();
						for(int k = 0; k < (playlists[j].getSongs()).length; k ++) {
						   if(s[k].getArtist().equals(i1)) {
							   System.out.println(s[k]);
							   yes = true;
						   }
						   
						}
					}
					if(!yes) {
						System.out.print("None");
					}
				}
				
				else if(i.equals("B")) {
					boolean yes2 = false;
						System.out.println("What year would you like to search: ");
						int i1 = scanin.nextInt();
						System.out.println("Songs from "+i1 + "\n");
						for(int j = 0; j < playlists.length; j ++) { 
							song[] s = new song[5];
							s = playlists[j].getSongs();
							for(int k = 0; k < (playlists[j].getSongs()).length; k ++) {
							   if(s[k].getYear() == i1) {
								   System.out.println(s[k]);
								   yes2 = true;
							   }
							   
							}
						}
						if(!yes2) {
							System.out.print("None");
						}
			}
				
			}
			else if(inp.equals("D")) {
				System.out.println("\nSorry this version hasn't been updated to do that.");
			}
		}
		scan.close();
		scan1.close();
	}
}
