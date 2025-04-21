public class Hooved extends Animal {
  public Hooved(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A hooved animal arrives.");
  }

  public Hooved() {
    System.out.println("A hooved animal arrives.");
  }

  public void forage() {
    System.out.println("The hooved animal forages for food.");
  }
}
