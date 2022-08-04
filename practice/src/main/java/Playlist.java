import java.util.ArrayList;

class Playlist {
	 
	public static void main(String[] args) {
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
		
		desertIslandPlaylist.add("Sneaker pimps - Six underground");
		desertIslandPlaylist.add("A Tribe Called Quest - Electric Relaxation");
		desertIslandPlaylist.add("Buena Vista Social Club - Murmullo");
		desertIslandPlaylist.add("Little Dragon - Blinking Pigs");
		desertIslandPlaylist.add("MF DOOM-Guinnesses");
		desertIslandPlaylist.add("Radiohead - Idioteque");
		desertIslandPlaylist.add("Erykah Badu - Drama")
		
		int indexB = desertIslandPlaylist.indexOf();
		
		String tempA = "Buena Vista Social Club - Murmullo";
		desertIslandPlaylist.remove("");
		
		System.out.println(desertIslandPlaylist.size()
		System.out.println(desertIslandPlaylist);
		
		desertIslandPlaylist.set(indexA,"A Tribe Called Quest - Electric Relaxation");
		
		desertIslandPlaylist.set(indexB,indexA);
		
		System.out.println(desertIslandPlaylist);
		
		
		
	}
}