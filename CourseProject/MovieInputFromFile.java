package CourseProject3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by none on 10.07.2017.
 */

//этот класс содержит метод для создания объекта класса Movie из ввода из текстового файлика
public class MovieInputFromFile {



    //другой вариант для считывания из файла, тоже неулюжий, но более компактный и правильный, что ли. Надо бы распилить.
    //Строки разделяются знаком ";", подстроки (несколько жанров, несолько актеров) разделяются запятыми без пробелов после запятой
    public static Movies InputAll() {
        Movies movies = new Movies();
        String file = "files/MoviesIO/MoviesList.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                Movie movie = new Movie();
                String[] temp = sCurrentLine.split(";");
                movie.setName(temp[0]);
                movie.setYearOfRelease(temp[1]);
                String[] genre = temp[2].split(",");
                for (String string : genre) {
                    movie.addGenre(string);
                }
                String[] actor = temp[3].split(",");
                for (String string : actor) {
                    movie.addActor(string);
                }
                movies.addMovie(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

    /*
Метод из старой версии курсовой, рабочий, но лучше им не пользоваться.
//построчно считывает текстовый файл, парсит по разделителю, и из частей собирает объекты Movie для массива Movies
public static Movies MovieInputAll() {
Movies movies = new Movies();
try (Scanner reader = new Scanner(new InputStreamReader(new FileInputStream("files/MoviesIO/notes.txt")))) {
List<String> chunks = new ArrayList<>();
int x = 0;
while (reader.hasNextLine()) {
for (String chunk : reader.nextLine().split(";")) {
chunks.add(chunk);
}
Movie movie = new Movie();
movie.setName(chunks.get(0));
movie.setYearOfRelease(chunks.get(1)); //вот этот момент с созданием кинца меня убивает, куча строчек в никуда. Надо что-то придумать.

ArrayList<String> genre = new ArrayList();
genre.add(chunks.get(2));
movie.setGenre(genre);

ArrayList<String> actor = new ArrayList();
actor.add(chunks.get(3));
movie.setActor(actor);

movies.addMovie(movie);
chunks = new ArrayList<>();
}
reader.close();

} catch (IOException e) {

}
return movies;
}
*/


}
