package com.spring.interfaces;

import java.awt.List;

public interface BookData {

	void fillData(String asin);

	String getAsin();

	int getPrice();

	int getRank();

	int getStar();

	List getReviews();

}
