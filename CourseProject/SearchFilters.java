package CourseProject3;


import java.util.List;

/**
 * Created by none on 07.07.2017.
 */
public class SearchFilters {

    public static Movies filterByName(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();

        for (Movie movie : movieList) {
            if (movie.getName().toLowerCase().contains(string.toLowerCase()))
                result.addMovie(movie);
        }

        return result;
    }

    public static Movies filterByYearOfRelease(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();

        for (Movie movie : movieList) {
            if (movie.getYearOfRelease().toLowerCase().contains(string.toLowerCase()))
                result.addMovie(movie);
        }

        return result;
    }

    public static Movies filterByYearReleasedAfter(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();

        for (Movie movie : movieList) {
            if (Integer.parseInt(movie.getYearOfRelease()) > Integer.parseInt(string))
                result.addMovie(movie);
        }

        return result;
    }

    public static Movies filterByYearReleasedBefore(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();

        for (Movie movie : movieList) {
            if (Integer.parseInt(movie.getYearOfRelease()) < Integer.parseInt(string))
                result.addMovie(movie);
        }

        return result;
    }

    public static Movies filterByYearReleasedInBetween(Movies movies, String from, String to) {
        Movies result = new Movies();
        result.setMovies(movies.getMovies());
        result = filterByYearReleasedAfter(result, from);
        result = filterByYearReleasedBefore(result, to);
        return result;
    }

    public static Movies filterByGenre(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();
        for (Movie movie : movieList){
            for (String genre : movie.getGenre()){
                if (genre.toLowerCase().contains(string.toLowerCase())){
                    result.addMovie(movie);
                }
            }
        }
        return result;
    }

    public static Movies filterByActor(Movies movies, String string) {
        Movies result = new Movies();
        List<Movie> movieList = movies.getMovies();
        for (Movie movie : movieList){
            for (String actor : movie.getActor()){
                if (actor.toLowerCase().contains(string.toLowerCase())){
                    result.addMovie(movie);
                }
            }
        }
        return result;
    }
}
