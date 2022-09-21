public class Main{
  public static void main(String[] a) {
    System.out.println("");
    Flag f1 = new Flag();
    Flag f2 = new Flag(true);
    Flag f3 = new Flag("Belgium","black,yellow, and red", true );
    iPhone phone = new iPhone();
    Flag f4 = new Flag ("Belgium","black,yellow, and red", true, phone );
  
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);

    System.out.println("");
    System.out.println("");
    System.out.println("");

    f3.fold();
    f3.Ccolors();
    f3.setWave(false);
    f3.wind();
    f4.conversation();
   
  }
}