public class Sea extends Journey{

    private int temp_water;
    private boolean swim_ability;



    public Sea (String purpose, String transport, int duration, int temp_water, boolean swim_ability){
        super(purpose, transport, duration);
        this.temp_water = temp_water;
        this.swim_ability = swim_ability;
    }
    public int price(){
        int price = this.getDuration()*80;
        return price;
    }

    public String printinfo() {
        return "\n Your journey to the sea: \n Purpose of travelling: " + this.getPurpose() + " \n Transport you are going by: " + this.getTransport() + "\n Duration of your journey: " + this.getDuration() + " days" + "\n The temperature of water in the sea: " + this.temp_water + " degrees Celsium \n You can swim: " + this.swim_ability + "\n Your journey will cost: " + price() + " euros";
    }



}
