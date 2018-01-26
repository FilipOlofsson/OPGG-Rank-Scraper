public class Test {
    public static void main(String[] args) {
        Scraper scraper = new Scraper("Swagip", Regions.EUW);
        System.out.println(scraper.getRank().getLp());
    }
    
}
