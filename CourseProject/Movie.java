package CourseProject3;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Movie {
    private String name;
    private String yearOfRelease;
    private List<String> genre = new ArrayList<>();
    private List<String> actor = new ArrayList<>();

    //----Constructors----
    public Movie() {

    }

    public Movie(String name, String yearOfRelease, List<String> genre, List<String> actor) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.actor = actor;
            }

    public void addGenre(String genre){
        this.genre.add(genre);
    }

    public void addActor(String actor){
        this.actor.add(actor);
    }

    //----Setters & Getters----
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getActor() {
        return actor;
    }

    public void setActor(List<String> actor) {
        this.actor = actor;
    }

    //----ToString methods----
    @Override
    public String toString() {
        return  "Название фильма: '" + name + '\'' +
                ", год Выпуска: '" + yearOfRelease + '\'' +
                ", жанр: " + genre.toString() +
                ", в главных ролях: " + actor.toString();
    }


    public String genreToString() {
        StringJoiner sj = new StringJoiner(",");
        for (String string : genre){
            sj.add(string);
        }

        return sj.toString();
    }

    public String actorToString() {
        StringJoiner sj = new StringJoiner(",");
        for (String string : actor){
            sj.add(string);
        }
        return sj.toString();
    }
}
