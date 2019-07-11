package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "showing")
public class Showing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int showing_id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable=false)
    private Movie movie;

    @Column(name = "film_starts", nullable = false)
    private LocalDateTime film_starts;

    @Column (name = "cinema_hall_number", nullable = false)
    private int cinema_hall_number;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,
            mappedBy = "showing", orphanRemoval = true)
    @Column(name = "RESERVATION", nullable = false)
    private List<Reservation> reservations;

    public int getShowing_id() {
        return showing_id;
    }

    public void setShowing_id(int showing_id) {
        this.showing_id = showing_id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getFilm_starts() {
        return film_starts;
    }

    public void setFilm_starts(LocalDateTime film_starts) {
        this.film_starts = film_starts;
    }

    public int getCinema_hall_number() {
        return cinema_hall_number;
    }

    public void setCinema_hall_number(int cinema_hall_number) {
        this.cinema_hall_number = cinema_hall_number;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return movie +
                ", film_starts=" + film_starts +
                ", hall_number=" + cinema_hall_number +
                '}';
    }
}
