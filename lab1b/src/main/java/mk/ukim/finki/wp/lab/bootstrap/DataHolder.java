package mk.ukim.finki.wp.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> listArtists = null;
    public static List<Song> listSongs = null;
    public static List<Album> listAlbums = null;

    @PostConstruct
    public void init() {

        listArtists = new ArrayList<>();
        listSongs = new ArrayList<>();
        listAlbums = new ArrayList<>();
        listArtists.add(new Artist(1L, "Toše", "Proeski", "Legenda na makedonskata muzika."));
        listArtists.add(new Artist(2L, "Dino", "Merlin", "Eden od najpoznatite bosanski pejači."));
        listArtists.add(new Artist(3L, "Jelena", "Karleuša", "Pop ikona od Srbije."));
        listArtists.add(new Artist(4L, "Zdravko", "Čolić", "Harizmatičen pejač od BiH."));
        listArtists.add(new Artist(5L, "Severina", "Vučković", "Hrvatska pop zvezda."));

        listAlbums.add(new Album("Igra bez granici", "Pop", "2004"));
        listAlbums.add(new Album("Bure", "Rock", "1999"));
        listAlbums.add(new Album("Dobrodošao u moj život", "Pop", "2007"));
        listAlbums.add(new Album("Haos", "Pop-folk", "2015"));
        listAlbums.add(new Album("Moja pesna", "Balade", "2010"));

        listSongs.add(new Song("Trešnja", "Pop", 2004, listAlbums.get(0)));
        listSongs.add(new Song("Kad si rekla da me voliš", "Rock", 1999, listAlbums.get(1)));
        listSongs.add(new Song("Ljubav je", "Pop", 2007, listAlbums.get(2)));
        listSongs.add(new Song("Idealna", "Pop-folk", 2015, listAlbums.get(3)));
        listSongs.add(new Song("Po tebe", "Balade", 2010, listAlbums.get(4)));
    }
}
