public class Rank {
    
    private int division;
    private int lp;
    private String tier;
    
    Rank(int division, String tier, int lp) {
        this.division = division;
        this.lp = lp;
        this.tier = tier;
    }
    
    
    public int getDivision() {
        return division;
    }
    
    public void setDivision(int division) {
        this.division = division;
    }
    
    public int getLp() {
        return lp;
    }
    
    public void setLp(int lp) {
        this.lp = lp;
    }
    
    public String getTier() {
        return tier;
    }
    
    public void setTier(String tier) {
        this.tier = tier;
    }
}
