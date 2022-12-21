package org.niit;

import org.niit.Domin.Movie;
import org.niit.MovieConfig.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie mov = applicationContext.getBean(Movie.class);
        System.out.println("mov = " + mov);

    }
}
