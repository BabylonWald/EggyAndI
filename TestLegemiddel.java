class TestLegemiddel{
  public TestLegemiddel(){

  }

  public static void main(String[] args){
    //tester Narkotisk
    Narkotisk narko = new Narkotisk("knark", 199.99, 200, 9);
    System.out.println(
    "narko\nstyrke: " + narko.hentNarkotiskStyrke()
    +"\nid: " + narko.hentId()
    +"\nnavn: " + narko.hentNavn()

    +"\nVirkestoff: " + narko.hentVirkestoff()
    +"\npris: " + narko.hentPris()
    + "\n bytter pris til 21."
    );
    narko.settNypris(21);
    System.out.println("ny pris: " + narko.hentPris() );


    //tester Vanedannende
    Vanedannende brus = new Vanedannende("cola", 23.50, 55000, 10);
    System.out.println("\nvane\n"
    + "vane: " + brus.hentVanedannendeStyrke()
    +"\nid: " + brus.hentId()
    +"\nnavn: " + brus.hentNavn()

    +"\nVirkestoff: " + brus.hentVirkestoff()
    +"\npris: " + brus.hentPris()
    + "\n bytter pris til 21."
    );
    brus.settNypris(21);
    System.out.println("ny pris: " + brus.hentPris() );


    Vanlig dop = new Vanlig("Greenest tea", 2.25, 14.5);
    System.out.println("\nvanlig\n"
    +"\nid: " + dop.hentId()
    +"\nnavn: " + dop.hentNavn()

    +"\nVirkestoff: " + dop.hentVirkestoff()
    +"\npris: " + dop.hentPris()
    + "\n bytter pris til 21."
    );
    dop.settNypris(21);
    System.out.println("ny pris: " + dop.hentPris() );


    System.out.println(narko.toString() );
    System.out.println(brus.toString() );
    System.out.println(dop.toString() );
  }
}
