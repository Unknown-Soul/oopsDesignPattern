package B_ObserverDesignPattern.ExampleOne;

import B_ObserverDesignPattern.ExampleOne.Channels.Channel;

import java.util.ArrayList;
import java.util.List;

public class Subscribers {
    private String name;
    private List<Channel> subSubscribedChannel = new ArrayList<>();

    // everytime a channel upload a video it will call this method
    public void update(String channelTitle){
        System.out.println(name+" video is uploaded on channel "+channelTitle);
    }

    // as soon as subscribe it should update our in our subScribed channelLi st
    public  void subScribed(Channel channel){
        subSubscribedChannel.add(channel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
