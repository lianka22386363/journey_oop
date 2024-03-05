public class Mountains extends Journey {
    private String season;
    private boolean experience;

    public Mountains(String purpose, String transport, int duration, String season, boolean experience) {
        super(purpose, transport, duration);
        this.season = season;
        this.experience = experience;
    }
    public int price(){
        int price = this.getDuration()*120;
        return price;
    }
    public String printinfo() {
        return "\n Your journey to the mountains: \n Purpose of travelling: " + this.getPurpose() + " \n Transport you are going by: " + this.getTransport() + "\n Duration of your journey: " + this.getDuration() + " days" + "\n Season: "+ this.season + "\n Did you have an experience in mountains: " + this.experience +  "\n Your journey will cost: " + price() + " euros";
    }
}
