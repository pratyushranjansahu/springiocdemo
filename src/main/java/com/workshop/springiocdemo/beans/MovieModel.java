package com.workshop.springiocdemo.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieModel {
	private String title;
    private String producer;

    // standard getters and setters

    @Override
    public String toString() {
        return String.format("MovieModel{title='%s', producer='%s'}", title, producer);
    }
}
