package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.MovieDetailModel;

@Service
public class MovieDetailService {
	
	public MovieDetailModel movieDetailModel(String movieName)
	{
		if(movieName.equalsIgnoreCase("Titanic"))
		{
		return new MovieDetailModel("Titanic","Beautiful Love Story");
		}
		if(movieName.equalsIgnoreCase("Braveheart"))
		{
		return new MovieDetailModel("Braveheart","Brave Story");
		}
		else
		{
		return new MovieDetailModel(movieName,"Don't have description in data base");
		}
		
	}

}
