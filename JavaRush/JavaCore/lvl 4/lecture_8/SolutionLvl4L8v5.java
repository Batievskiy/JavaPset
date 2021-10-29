/*
 * 1. All the classes must be inside of Solution class;
 * - Create class Cartoon, Thriller, SoapOpera;
 * 3. Create class MovieFactory:
 * - implement method getMovie() - to get corresponding class;
 * 4. Read from console lines (cartoon, thriller, soapOpera) till something else;
 * - create variable movie type Movie:
 * - for all lines - get object from MovieFactory;
 * - assign each object to movie variable;
 * - print out its simpleName()
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SolutionLvl4L8v5 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            String key = null;
            while ((key = bufferedReader.readLine()) != null) {
                Movie movie = MovieFactory.getMovie(key);
                if (movie == null) return;
                System.out.println(movie.getClass().getSimpleName());
            }
        }
    }

    static abstract class Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }

    static class SoapOpera extends Movie {

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            switch (key) {
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;
                case "soapopera":
                    movie = new SoapOpera();
                    break;
            }
            return movie;
        }
    }
}
