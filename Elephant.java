public class Elephant extends Animal {
  public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
    //step 19 did not call the animal consturctor so the variables were not initialized
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An elephant arrives.");
  }

  public Elephant() {
    System.out.println("An elephant arrives.");
  }

  public void trumpet() {
    System.out.println("The elephant trumpets loudly!");
  }

  public void forage() {
    System.out.println("The elephant forages for food.");
  }
}
