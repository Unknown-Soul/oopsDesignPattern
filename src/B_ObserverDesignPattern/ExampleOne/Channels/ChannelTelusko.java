package B_ObserverDesignPattern.ExampleOne.Channels;

import B_ObserverDesignPattern.ExampleOne.Subscribers;

import java.util.ArrayList;
import java.util.List;

public class ChannelTelusko implements Channel{

    private  List<Subscribers> subscribersList = new ArrayList<>();
    private  String title;

    @Override
    public List<Subscribers> listOfSubscribers() {
        return subscribersList;
    }

    @Override
    public void subscribe(Subscribers user) {
        subscribersList.add(user);
    }

    @Override
    public void unSubscribe(Subscribers user) {
        subscribersList.remove(user);
    }


    @Override
    public void notifi() {
        subscribersList.forEach(it->it.update(this.title));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void upload(String title) {
        // as soon as video will be uploaded a notification will go to all the subScribers
        this.title = title;
        this.notifi();
    }


}
