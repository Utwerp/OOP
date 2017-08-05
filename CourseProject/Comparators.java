package CourseProject3;

import java.util.Comparator;



/**
 * Created by none on 10.07.2017.
 */
public enum Comparators implements Comparator<Movie> {

    BY_NAME{//метод сортирует по имени
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    },

    BY_YEAR {//метод сортирует по году выпуска
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYearOfRelease().compareTo(o2.getYearOfRelease());
        }
    }

}
