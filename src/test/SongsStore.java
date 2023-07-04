package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SongsStore {

	    private final int capacity;
	    private final Map<String, LinkedList<String>> store;

	    public SongsStore(int capacity) {
	        this.capacity = capacity;
	        this.store = new HashMap<>();
	    }

	    public void addSong(String user, String song) {	
	        if (!store.containsKey(user)) {
	            store.put(user, new LinkedList<>());
	        }
	        
	        LinkedList<String> userSongs = store.get(user);
	        
	        if (userSongs.contains(song)) {
	            userSongs.remove(song);
	        } else if (userSongs.size() >= capacity) {
	            userSongs.removeFirst();
	        }
	        
	        userSongs.addLast(song);
	    }

	    public List<String> getRecentlyPlayedSongs(String user) {
	        return store.getOrDefault(user, new LinkedList<>());
	    }

}
