package com.spring.interfaces;

import java.util.Date;

public interface Review {

	void fillInfo(String asin);

	String getAsin();

	Date getDate();

	String getAuthor();

	int getStars();

	String getTitle();

	String getText();

}
