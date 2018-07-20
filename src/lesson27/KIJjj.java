package lesson27;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class KIJjj {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://www.delfi.lt/").get();

        String title = doc.title();
        System.out.println("Title: " + title);

        Elements links = doc.select("a[href]");

        for (Element link : links) {
            System.out.println("\n Link: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }
    }
}
