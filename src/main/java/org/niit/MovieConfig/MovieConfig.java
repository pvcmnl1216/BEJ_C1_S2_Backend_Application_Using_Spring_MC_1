/*
 * Author Name: Philip Meshach
 * Date: 21-12-2022
 * Praise The Lord
 */
package org.niit.MovieConfig;

import org.niit.Domin.Movie;
import org.springframework.context.annotation.Bean;

public class MovieConfig {
    @Bean
    public Movie getDetails(){
        return new Movie("Avatar2","2","9.2");
    }
}
