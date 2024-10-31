package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Event> eventList = new ArrayList<>();

    @PostConstruct
    public void init() {
        eventList.add(new Event("Summer Jazz Festival", "Enjoy live jazz music from renowned artists under the open sky", 10.00));
        eventList.add(new Event("Tech Innovation Summit", " Discover the latest advancements in AI and technology",  9.20));
        eventList.add(new Event("Gourmet Food Expo", "Taste dishes from world-class chefs and discover new culinary trends", 6.65));
        eventList.add(new Event("Yoga and Wellness Retreat", " Relax and rejuvenate with yoga sessions and wellness workshops", 8.50));
        eventList.add(new Event("Local Art Showcase", "A collection of modern art from upcoming local artists", 5.70));
        eventList.add(new Event("Indie Film Screening", "Watch unique films from independent filmmakers", 7.85));
        eventList.add(new Event("Marathon for a Cause", " Participate in a marathon supporting community causes", 2.90));
        eventList.add(new Event("Book Lovers Convention", "Meet authors and attend book signings and literary talks", 1.55));
        eventList.add(new Event("Coding Bootcamp Weekend", "Intensive coding sessions for aspiring software developers", 10.00));
        eventList.add(new Event("Charity Gala Night", "A glamorous evening of dining and entertainment for a good cause", 9.30));
    }
}