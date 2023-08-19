package B_ObserverDesignPattern.ExampleOne.Channels;

import B_ObserverDesignPattern.ExampleOne.Subscribers;

import java.util.List;

public interface Channel {
    List<Subscribers> listOfSubscribers();

    void subscribe(Subscribers user);
    void unSubscribe(Subscribers user);
    void notifi();

    void upload(String title);
}
