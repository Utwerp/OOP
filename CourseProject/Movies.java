package CourseProject3;



import java.util.ArrayList;
import java.util.List;


public class Movies {
    private List<Movie> movies = new ArrayList<>();

    public Movies(){

    }
    //----Constructors----
    public Movies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    //----Setters & Getters----

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        List<Movie> temp = movies;
        this.movies = temp;
    }

    //----Вывод в консоль----
    public void printAll(){
        for (Movie movie : movies){
            System.out.println(movie.toString());
        }
    }

    public void writeInFile(){
        Output.writeIntoFile(this);
    }
}
