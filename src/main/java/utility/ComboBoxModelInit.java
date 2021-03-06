package utility;

import model.Movie;

import javax.swing.*;
import java.util.List;


public class ComboBoxModelInit extends DefaultComboBoxModel<Movie> {

    private List<Movie> movies;

    public ComboBoxModelInit(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getSize() {
        return movies.size();
    }

    @Override
    public Movie getElementAt(int index) {
        return movies.get(index);
    }
}
