package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.MovieDetailModel;
import com.example.service.MovieDetailService;

@RestController
public class MovieDetailController {
	
	@Autowired
	MovieDetailService movieDetailService;
	
	@RequestMapping("/moviedetail/{movieName}")
	public MovieDetailModel movieDetailModel(@PathVariable("movieName") String movieName)
	{
		return movieDetailService.movieDetailModel(movieName);
	}

}
