class PResept extends Hvit{
  protected static double rabatt = 108.00;

  protected PResept(Legemiddel legemiddel, Lege utskrivendeLege,
  int pasientId){
    //siste super-parameter 3 gir forhåndsbestemte 3 reit.
    super(legemiddel, utskrivendeLege, pasientId, 3);
  }

  @Override
  public double prisAaBetale(){
    if(legemiddel.hentPris() <= rabatt){
      return 0.00;
    }
    else{
      return legemiddel.hentPris() - rabatt;
    }
  }

  @Override
  public String toString(){
    return "hvit PResept\n" + super.toString();
  }
}
