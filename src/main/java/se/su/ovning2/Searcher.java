package se.su.ovning2;

import java.util.*;

public class Searcher implements SearchOperations {

    private Map<String, Set<Recording>> artistToRecordings = new HashMap<>();

    public Searcher(Collection<Recording> data) {
        for (Recording r : data) {
            String artist = r.getArtist();
            if (artistToRecordings.containsKey(artist)) {
                Set<Recording> recordings = artistToRecordings.get(artist);
                recordings.add(r);
            } else {
                Set<Recording> recordings = new HashSet<>();
                recordings.add(r);
                artistToRecordings.put(artist, recordings);
            }
        }
        Collection<Recording> recordings = data;
    }

    @Override
    public long numberOfArtists() {
        return artistToRecordings.size();
    }

    @Override
    public long numberOfGenres() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numberOfGenres'");
    }

    @Override
    public long numberOfTitles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numberOfTitles'");
    }

    @Override
    public boolean doesArtistExist(String name) {
        return artistToRecordings.containsKey(name);
    }

    @Override
    public Collection<String> getGenres() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
    }

    @Override
    public Recording getRecordingByName(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
    }

    @Override
    public Collection<Recording> getRecordingsAfter(int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
    }

    @Override
    public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
    }

    @Override
    public Collection<Recording> getRecordingsByGenre(String genre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
    }

    @Override
    public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
    }

    @Override
    public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
    }
}


