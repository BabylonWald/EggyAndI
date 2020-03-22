class TestResepter{

  public TestResepter(){

  }

  //tester Resepter
  public static void main(String[] args){
    //lager nye objekter som skal brukes til testing
    Lege lege  = new Lege("Dr. Who");
    Vanlig dop = new Vanlig("Greenest tea", 120, 14.5);
    Vanedannende koffein = new Vanedannende("Earl Grey", 53, 13, 9);

    //lager utskrifter.
    Blaa teKur = new Blaa(dop, lege, 420, 20);
    System.out.println("\nBlaa\nfarge: " + teKur.farge() + "\nopprinnelig pris: " +
    dop.hentPris() + "\nresept pris: " + teKur.prisAaBetale());


    Hvit hobbyTe = new Hvit(dop, lege, 420, 20);
    System.out.println("\n Hvit \nfarge: " + hobbyTe.farge() + "\nopprinnelig pris: " +
    dop.hentPris() + "\nresept pris: " + hobbyTe.prisAaBetale());


    Militaer armyTe = new Militaer(dop, lege, 420, 20);
    System.out.println("\nMilitaer \nfarge: " + armyTe.farge() + "\nopprinnelig pris: " +
    dop.hentPris() + "\nresept pris: " + armyTe.prisAaBetale());


    PResept prevansjonsTe = new PResept(dop, lege, 420);
    System.out.println("\nPResept \nfarge: " + prevansjonsTe.farge()
    + "\nopprinnelig pris: " + dop.hentPris() + "\nresept pris: " +
    prevansjonsTe.prisAaBetale());

    //tester med pris<108.0
    PResept prevansjonsTe2 = new PResept(koffein, lege, 420);

    System.out.println("\nPResept pris<108.0 \nfarge: " + prevansjonsTe2.farge()
    + "\nopprinnelig pris: " + koffein.hentPris() + "\nresept pris: " +
    prevansjonsTe2.prisAaBetale() + "\nstyrke: " +
    koffein.hentVanedannendeStyrke() );
  }
}
