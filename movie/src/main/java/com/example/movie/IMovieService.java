package com.example.movie;

import java.util.List;

public interface IMovieService {
	
	public List<Movie> searchByName(String movieName);
	public Movie searchById(String id);
	
}