package fish.payara.appserver.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import fish.payara.appserver.model.MovieInfo;
import fish.payara.appserver.model.Person;

/**
 * @author keuller.magalhaes at gmail.com
 * @version 1.0
 */
@RestController
@RequestMapping("/friends")
public class FriendRestController {

    // uses http://www.omdbapi.com API
    final String BASE_URL = "http://www.omdbapi.com/?t={title}&y=&plot=full&r=json";
    
    final Map<Integer, Person> personMap = new HashMap<>();

    private RestTemplate restClient;
    
    public FriendRestController() {
        this.restClient = new RestTemplate();
    }
    
    @PostConstruct
    public void init() {
        personMap.put(1, new Person(1, "Rachel", "Green", "rachelreen@gmail.com"));
        personMap.put(2, new Person(2, "Monica", "Geller", "monica@aol.co.uk"));
        personMap.put(3, new Person(3, "Joey", "Tribbiani", "joey.tribbiani@yahoo.co.uk"));
        personMap.put(4, new Person(4, "Chandler", "Bing", "chandler@gamil.co.uk"));
        personMap.put(5, new Person(5, "Ross", "Geller", "ross@aol.co.uk"));
        personMap.put(6, new Person(6, "Phoebe", "Buffay", "phoebe@yahoo.co.uk"));
    }

    @RequestMapping
    public Collection<Person> getAll() {
        return personMap.values();
    }

    @RequestMapping("/info")
    public MovieInfo getFriendsInfo() {
        return restClient.getForObject(BASE_URL, MovieInfo.class, "friends");
    }
    
    @RequestMapping("/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        Optional<Person> friend = personMap.values().stream()
            .filter(person -> person.id.equals(id))
            .findFirst();
        return friend.get();
    }
    
}
