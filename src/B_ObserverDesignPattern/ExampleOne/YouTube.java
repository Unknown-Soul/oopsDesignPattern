package B_ObserverDesignPattern.ExampleOne;

import B_ObserverDesignPattern.ExampleOne.Channels.Channel;
import B_ObserverDesignPattern.ExampleOne.Channels.ChannelTelusko;

public class YouTube {
    public  static  void main(String args[]){
        Subscribers subscribers1 = new Subscribers();
        subscribers1.setName("A1");

        Subscribers subscribers2 = new Subscribers();
        subscribers2.setName("A2");

        ChannelTelusko channel = new ChannelTelusko();

        // subscriber subscribed to our channel
        channel.subscribe(subscribers1);
        channel.subscribe(subscribers2);


        // As soon as ChannelTelusko upload video they will get notified
        channel.upload("Observer Design Pattern Video");
    }
}
