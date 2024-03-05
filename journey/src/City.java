public class City extends Journey {
    String overnight_stay;
    String language;

    public City(String purpose, String transport, int duration, String overnight_stay, String language) {
        super(purpose, transport, duration);
        this.overnight_stay = overnight_stay;
        this.language = language;
    }
    public int price(){
        int price = this.getDuration()*150;
        return price;
    }
    public String printinfo() {
        return "\n Your journey to the city: \n Purpose of travelling: " + this.getPurpose() + " \n Transport you are going by: " + this.getTransport() + "\n Duration of your journey: " + this.getDuration() + " days" + "\n Overnight stay in: " + this.overnight_stay + "\n Language locals speak there: " + this.language + "\n Your journey will cost: " + price() + " euros";
    }
}
