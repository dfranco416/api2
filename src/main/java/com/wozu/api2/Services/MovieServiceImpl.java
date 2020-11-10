package com.wozu.api2.Services;

import com.wozu.api2.Models.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MovieServiceImpl implements MovieService {

    @Value("${api_key}")
    String api_key;

    @Override
    public Movie getMovieFromMovieApi(String search) {
        String url = "http://www.omdbapi.com/?apikey=" + api_key + "&t="+ search + "&plot=full";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,Movie.class);
    }
}
