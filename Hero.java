public class Hero {

  // attributes
  private String name;
  private int powerLevel;
  private String affiliation;

  // the constructor
  public Hero(String name, int powerLevel, String affiliation) {
      this.name = name;
      this.powerLevel = powerLevel;
      this.affiliation = affiliation;
  }

  // getter methods
  public String getName() {
      return name;
  }
  public int getPowerLevel() {
      return powerLevel;
  }
  public String getAffiliation() {
      return affiliation;
  }

  // toString method
  @Override
  public String toString() {
      return "Hero: " + name + " | Power: " + powerLevel + " | Affiliation: " + affiliation;
  }
}
