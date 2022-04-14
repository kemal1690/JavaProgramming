package day39_Recap.deviceTask;

public class TV extends Device{

    public int channel;
    public TV(String brand, String model, double price,int channel) {
        super(brand, model, price);
        this.channel = channel;
    }


    public void channelUp(){

        if(channel <=0){
            System.out.println("Channel up");
        }
    }

    public void channelDown(){

        if(channel>=10)
        System.out.println("Channel down");
    }


}
