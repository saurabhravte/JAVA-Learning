import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record MovieTitle(String name, double rating, int releaseYear){}

public class MovieSorting {
    static void main() {
        List<MovieTitle> titles = new ArrayList<>();
        titles.add(new MovieTitle("Dune: Part Two",4.8,2024));
        titles.add(new MovieTitle("Oppenheimer",4.7,2023));
        titles.add(new MovieTitle("Spider-Man: Across the Spider-Verse",4.9,2023));

//        sort values on the ratings from critics
        titles.sort(Comparator.comparingDouble(MovieTitle::rating).reversed());
        System.out.println(titles);

//        sort value on the based on the release year
        titles.sort(Comparator.comparingInt(MovieTitle::releaseYear).reversed());
        System.out.println(titles);
    }
}
