package CourseProject3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by none on 11.07.2017.
 */


public class Output {
    //Метод выводит в файлик список List<Movie> movies из объекта класса Movies в том же формате,
    //что и метод из класса MovieInputFromFile
    public static void writeIntoFile(Movies movies){
        final String FILENAME = "files/MoviesIO/MoviesOut.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            List<Movie> list = movies.getMovies();

            for (Movie movie : list){
                StringJoiner sj = new StringJoiner(";");
                sj.add(movie.getName()).add(movie.getYearOfRelease()).add(movie.genreToString()).add(movie.actorToString());//А вот тут получилось. Как?
                String content = sj.toString();
                bw.write(content);
                bw.newLine();
            }

            System.out.println("Done");

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
