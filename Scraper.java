import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Scraper {
    
    String profile;
    Regions region;
    
    Scraper(String profile, Regions region) {
        this.region = region;
        this.profile = profile;
    }
    
    Rank getRank() {
        try {
            Document doc = Jsoup.connect("http://" + region + ".op.gg/summoner/userName=" + profile).get();
            String rank = doc.select("span.tierRank").html();
            String[] splitRank = rank.split(" ");
            int lp = Integer.parseInt(doc.select("span.LeaguePoints").html().split(" ")[0]);
            return new Rank(Integer.parseInt(splitRank[1]), splitRank[0], lp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
