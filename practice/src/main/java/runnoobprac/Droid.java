package runnoobprac;

public class Droid {
  int batteryLevel;
  String name;

  public Droid(String droidName) {
    batteryLevel = 100;
    name = droidName;
  }
  public String toString() {
    return "Hello, I’m the droid:" + name;
  }
  public void performTask(String task) {
    System.out.println(name + "is performing task:"+ task);
    batteryLevel = batteryLevel - 10;

  }
  public static void main(String[] args) {
    Droid cody = new Droid("Codey");
    System.out.println(cody);
    cody.performTask("dancing");
    cody.performTask("coding");
  }
}