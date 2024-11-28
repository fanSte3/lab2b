package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.bootstrap.DataHolder;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class SongRepository {
    public List<Song> findAll(){
        return DataHolder.listSongs;
    }
    public Song findByTrackId(Long trackId){
        return DataHolder.listSongs.stream().filter(s -> s.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Artist artist, Song song){
        song.addArtist(artist);
        return artist;
    }

    public Optional<Song> save(String title, String genre, Integer releaseYear, Album album){
        Song song = new Song(title, genre, releaseYear, album);
        DataHolder.listSongs.removeIf(s -> Objects.equals(s.getTitle(), title));
        DataHolder.listSongs.add(song);
        return Optional.of(song);
    }

    public void deleteById(Long id) {
        DataHolder.listSongs.removeIf(s -> s.getTrackId().equals(id));
    }
}
