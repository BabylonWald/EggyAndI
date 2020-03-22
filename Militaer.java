class Militaer extends Hvit{

  protected Militaer(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId, int reit){
    super(legemiddel, utskrivendeLege, pasientId, reit);
  }
  //100% rabatt.
  @Override
  public double prisAaBetale(){
    return 0.00;
  }

  @Override
  public String toString(){
    return "hvit Militaer\n" + super.toString();
  }
}
