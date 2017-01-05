package com;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class parse {

	public void start() {
		Document doc;
		try {
			doc = Jsoup.connect("https://www.amazon.com/dp/B01MYVVSEX").userAgent("Mozilla/5.0 Chrome/26.0.1410.64 Safari/537.31").timeout(2 * 1000).followRedirects(true).maxBodySize(1024 * 1024 * 3) // 3Mb
																																																		// Max
					// .ignoreContentType(true) //for download xml, json, etc
					.get();

			Elements s = doc.getElementsByTag("li");
			for (Element e : s) {
				if (e.text().contains("Print Length:")) {
					System.out.println(e.text());
				}
				if (e.text().contains("Publication Date:")) {
					System.out.println(e.text());
				}
				if (e.text().contains("Amazon Best Sellers Rank:")) {
					System.out.println(e.text());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
