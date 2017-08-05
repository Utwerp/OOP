package CourseProject3;



import java.util.Collections;



/**
 * Created by none on 10.07.2017.
 */
public class MoviesRunner {
    public static void main(String[] args) {
        final Movies moviesList = MovieInputFromFile.InputAll();//считывает из файлика фильмы
        Movies temp = new Movies();

        temp.setMovies(moviesList.getMovies()); //копия для последующей обработки
        temp = SearchFilters.filterByYearReleasedInBetween(temp, "1980", "2010"); //выборка по годам от и до


        Collections.sort(temp.getMovies(), Collections.reverseOrder(Comparators.BY_YEAR)); //сортировка по годам в обратном порядке.


        temp.printAll(); //вывод в консоль

        temp.writeInFile();//вывод в файл

    }
}

