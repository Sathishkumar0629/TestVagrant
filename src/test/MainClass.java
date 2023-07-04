package test;

public class MainClass {

	public static void main(String[] args) {
		
		        SongsStore store = new SongsStore(3);

		        store.addSong("Sathish", "S1");
		        store.addSong("Sathish", "S2");
		        store.addSong("Sathish", "S3");

		        System.out.println("The initial playlist is -> " + String.join(",", store.getRecentlyPlayedSongs("Sathish")));

		        store.addSong("Sathish", "S4");
		        System.out.println("When S4 song is played -> " + String.join(",", store.getRecentlyPlayedSongs("Sathish")));

		        store.addSong("Sathish", "S2");
		        System.out.println("When S2 song is played -> " + String.join(",", store.getRecentlyPlayedSongs("Sathish")));

		        store.addSong("Sathish", "S1");
		        System.out.println("When S1 song is played -> " + String.join(",", store.getRecentlyPlayedSongs("Sathish")));
		}

}

