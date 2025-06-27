import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;

    public HeroManager() {
        this.heroes = new ArrayList<>();
    }

    // the list for the heroes
    public List<Hero> getHeroes() {
        return new ArrayList<>(heroes);
    
    // adding heroes
    public void addHero(Hero hero) {
        heroes.add(hero);
        System.out.println(hero.getName() + " added");
    }

    // removing heroes
    public void removeHero(String name) {
        boolean removed = heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println(name + " removed");
        } else {
            System.out.println(name + " not found");
        }
    }

    // this is the bubble sort part
    public void bubbleSortHeroesByPower() {
        int n = heroes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j< n - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
        System.out.println("Heroes have been sorted by their power level in ascending order using bubble sort.");
    }

    // this is the insertion sort part
    public void insertionSortHeroesByPower() {
        int n = heroes.size();
        for (int i = 1; i < n; ++i) {
            Hero key = heroes.get(i);
            int j = i - 1;

            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j = j - 1;
            }
            heroes.set(j + 1, key);
        }
        System.out.println("Heroes have been sorted by their power level in ascending order using insertion sort.");
    }

    // displaying heroes as a 2D array
    public void displayHeroesAs2DArray() {
        if (heroes.isEmpty()) {
          System.out.println("No heroes to display");
          return;
        }

        String[][] heroData = new String[heroes.size()][3]; 
        for (int i = 0; i< heroes.size(); i++) {
            Hero hero = heroes.get(i);
            heroData[i][0] = hero.getName();
            heroData[i][1] = String.valueOf(hero.getPowerLevel());
            heroData[i][2] = hero.getAffiliation();
        }
        System.out.println("Heroes in 2D Array format:");
        System.out.println(Arrays.deepToString(heroData));
    }
}
