class Hovedprogram{
  public Hovedprogram(){

  }

  public static void main(String[] args){
    Lege lege  = new Lege("Dr. Who");
    System.out.println("lege\n"+ lege.toString() +"\n");

    Spesialist spesialist = new Spesialist("Solid Snake", 1972);
    System.out.println("spesialist\n"+ spesialist.toString()+"\n" );


    Vanlig dop = new Vanlig("Greenest tea", 120, 14.5);
    System.out.println(dop.toString() +"\n");

    Vanedannende koffein = new Vanedannende("Earl Grey", 53, 13, 9);
    System.out.println(koffein.toString() +"\n");

    Narkotisk narko = new Narkotisk("knark", 199.99, 200, 9);
    System.out.println(narko.toString() +"\n");


    Blaa teKur = new Blaa(koffein, lege, 420, 20);
    System.out.println(teKur.toString() +
    "\npris å betale: " + teKur.prisAaBetale() +"\n");
    //pris å betale... kunne vært med i toString, men jeg skrev det ut
    //for å ikke trenge å hoppe fram og tilbake i filer.

    Hvit hobbyTe = new Hvit(dop, lege, 420, 20);
    System.out.println("Hvit\n"+hobbyTe.toString() +
    "\npris å betale: " + hobbyTe.prisAaBetale() +"\n");

    PResept prevansjonsTe = new PResept(dop, lege, 420);
    System.out.println(prevansjonsTe.toString() +
    "\npris å betale: " + prevansjonsTe.prisAaBetale() +"\n");

    Militaer armyTe = new Militaer(koffein, lege, 420, 20);
    System.out.println(armyTe.toString() +"\npris å betale: " +
    armyTe.prisAaBetale() +"\n");

  }
}
