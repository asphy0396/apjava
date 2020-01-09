import java.util.*;

public class Playlist { // Instance variable
  private List<Song> songs; // arraylist of songs
  private String name; // Playlist name

  public Playlist(String name) {
    songs = new ArrayList<Song>(); // initalize Arraylist to hold Song type
    this.name = name;
  }

  // Methods:
  // Returns the playlist name
  public String playlistName() {
    return name;
  }
  // adds Song s to Playlist
  public boolean addSong(Song s) {
    return songs.add(s);
  }

  public boolean removeSong(Song s) {
    return songs.remove(s);
  }

  public int totalSongs() {
    return songs.size();
  }

  public double playlistTime() {
    double out = 0;
    for (Song s : songs) out += s.getPlayTime();
    return out;
  }

  public boolean isSongInPlaylist(String name) {
    for (Song s : songs) if (s.getSongName().equals(name)) return true;
    return false;
  }

  public void songsByArtist(String name) {
    for (Song s : songs) if (s.getArtist().equals(name)) System.out.println(s);
  }

  public boolean addSongsFrom(Playlist p) {
    if (p.totalSongs() == 0) return false;
    for (Song s : p.getList()) if (!songs.contains(s)) songs.add(s);
    return true;
  }
  // return list. Note return is List<Song>.
  public List<Song> getList() {
    return songs;
  }

  public String toString() {
    return songs.toString();
  }
} // end of class Playlist
