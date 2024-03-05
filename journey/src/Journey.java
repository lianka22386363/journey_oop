import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Journey {
    private String purpose;
    private String transport;
    private int duration;

    public Journey(String purpose, String transport, int duration) {
        this.purpose = purpose;
        this.transport = transport;
        this.duration = duration;
    }
    public String printinfo() {
        return "\n Your journey: \n Purpose of travelling: " + purpose + " \n Transport you are going by: " + transport + "\n Duration of your journey: " + duration + " days";
    }

    public String getPurpose() {
        return purpose;
    }

    public String getTransport() {
        return transport;
    }

    public int getDuration() {
        return duration;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
