class Hvit extends Resept{
  protected Hvit(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId,
  int reit){
    super(legemiddel, utskrivendeLege, pasientId);
    this.reit = reit;
  }

  public String farge(){
    return "hvit";
  }

  public double prisAaBetale(){
    return legemiddel.hentPris();
  }

  @Override
  public String toString(){
    return "hvit\n" + super.toString();
  }
}
