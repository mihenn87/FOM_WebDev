package com.videothek.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MovieDataUtil {
	public static List<Movie> getMovies(){
		
		List<Movie> movies=new ArrayList<>();
		
		try {
			movies.add(new Movie("Priates","Priates",new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2005"),"12345"));
			movies.add(new Movie("Fluch der Karibik","Pirates of the Caribean",new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2010"),"123758"));
			movies.add(new Movie("Star Trek","Star Trek",new SimpleDateFormat("dd/MM/yyyy").parse("12/05/2009"),"12345"));
			movies.add(new Movie("Indiana Jones","Indiana Jones",new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1970"),"tt12345"));
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return movies;
	}
	
	
}
