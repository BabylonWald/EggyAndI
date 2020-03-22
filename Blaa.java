class Blaa extends Resept{

  protected Blaa(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId,
  int reit){
    super(legemiddel, utskrivendeLege, pasientId);
    this.reit = reit;
  }

  public double prisAaBetale(){
    return legemiddel.hentPris()*(0.25);

  }
  public String farge(){
    return "blaa";
  }

  @Override
  public String toString(){
    return "blaa\n" + super.toString();
  }
}
