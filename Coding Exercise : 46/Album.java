import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Album 
{
    private String name;
    private String artist;
    LinkedList<Song> songs = new LinkedList<>();
    

    public Album(String name, String artist) 
    {
        this.name = name;
        this.artist = artist;
        this.songs = new LinkedList<>();
    }

    public boolean addSong(String title, double duration) 
    {
        if(albumList.add(new Song(name, duration)))
        {
            System.out.println("new song " + name + ": " + duration + "s" + " added to album " + this.name);
            return true;
        }
        else
        {
           return false; 
        }
    }

    public void getSongsFromInside()
    {
        for (int i = 0; i < this.albumList.size(); i++) 
        {
            System.out.println("    " + this.albumList.get(i).getTitle());
        }
    }

    private Song findSong(String title) 
    {
        for (Song checkedSong : this.albumList) 
        {
            if (checkedSong.getTitle().equals(title)) 
            {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String trackNumber, LinkedList<Song> playlist) 
    {
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.albumList.size())) 
        {
            playlist.add(this.albumList.get(index));
            return true;
        }
        System.out.println("this album does not contain track no: " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String songTittle, LinkedList<Song> playlist) 
    {
        Song checkedSong = findSong(title);
        if (checkedSong != null) 
        {
            playlist.add(checkedSong);
            System.out.println("Song " + title + " added to playlist");
            return true;
        }
        System.out.println("Can not find song");
        return false;
    }

}
