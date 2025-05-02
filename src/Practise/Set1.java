
// 1) Movie (Price,Movie_name) - Base Class, Abstract Class
// 2) HollywoodMovie - Child Class
// 3) BollywoodMovie – Child Class
// Add default and parameterized constructors in all three
// classes. Add showDetails functions in all three classes
abstract class Movie {

    int Price;
    String movieName;

    @SuppressWarnings("unused")
    Movie() {
        Price = 0;
        movieName = null;
    }

    Movie(int Price, String movieName) {
        this.Price = Price;
        this.movieName = movieName;
    }

    void showDetails() {
        System.out.println("Price : " + Price);
        System.out.println("Movie Name : " + movieName);
    }
}

class HollywoodMovie extends Movie {

    int duration;

    public HollywoodMovie() {
        super(0, "Nothing");
    }

    public HollywoodMovie(int price, String movieName, int duration) {
        super(price, movieName);
        this.duration = duration;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Duration : " + duration);
    }

}

class BollywoodMovie extends Movie {

    int duration;

    public BollywoodMovie() {
        super(0, "Nothing");
    }

    public BollywoodMovie(int price, String movieName, int duration) {
        super(price, movieName);
        this.duration = duration;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Duration : " + duration);
    }

}

public class Set1 {

    public static void main(String[] args) {
        HollywoodMovie hm = new HollywoodMovie(200, "Nothing", 2);
        HollywoodMovie hm2 = new HollywoodMovie(200, "Nothing", 2);
        BollywoodMovie bm = new BollywoodMovie(3000, "Wow", 3);
        BollywoodMovie bm2 = new BollywoodMovie(3000, "Wow", 3);
        hm.showDetails();
        hm2.showDetails();
        bm.showDetails();
        bm2.showDetails();

    }
}
