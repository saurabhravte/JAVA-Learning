import java.util.*;

public class StreamingCollection {
    static void main() {
//        maintain my watch list
        List<String> watchList = new ArrayList<>();
        watchList.add("Stranger Things");
        watchList.add("Dark");
        watchList.add("Naruto");
        watchList.add("Stranger Things");

        String recent = watchList.get(0);
        watchList.remove("Naruto");

        System.out.println(watchList);


//        Maintain Game achivement
        Set<String> achivementStore = new LinkedHashSet<>();
        achivementStore.add("Defeat Ender Dragon");
        achivementStore.add("Defeat First Dragon");
        achivementStore.add("Defeat Ender Dragon");

        System.out.println(achivementStore);

//        profile page
        Map<String,String> profilePreference = new HashMap<>();
        profilePreference.put("Riya","Anime");
        profilePreference.put("Saurabh", "Comedy");

        System.out.println(profilePreference.get("Saurabh"));
        System.out.println(profilePreference);
    }
}
