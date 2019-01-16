package movies;
import java.util.Arrays;
import util.Input;



public class MoviesApplication {
    public static void main(String[] args){


Movie[] movies = MoviesArray.findAll();
        Input input = new Input();

        for(int x = 0; x<1000;x++ ) {

            System.out.println("Enter 0 to exit ");
            System.out.println("Enter 1 to show all movie ");
            System.out.println("Enter 2 to show drama movies ");
            System.out.println("Enter 3 to show horror movies ");
            System.out.println("Enter 4 to show scifi movies ");
            System.out.println("Enter 5 to show animated movies ");

            int y = input.getInt();

            System.out.println();

    //exits
            if(y==0){
                x=x+10001;
            }



      //shows all movies
            if(y==1) {
        for(Movie movie : movies){
            System.out.println(movie.getName());
        }
            }


            //shows all drama movies
            if(y==2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("musical"))
                        System.out.println(movie.getName());
                }
            }

            //shows all horror movies
            if(y==3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror"))
                        System.out.println(movie.getName());
                }
            }




            //shows all scifi movies
            if(y==4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi"))
                        System.out.println(movie.getName());
                }
            }



            //shows all animated movies
            if(y==5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated"))
                        System.out.println(movie.getName());
                }
            }

















        }


}

    }
