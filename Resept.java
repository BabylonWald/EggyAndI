abstract class Resept{
  protected static int teller = 0;
  protected int id = teller;
  protected Legemiddel legemiddel;
  protected Lege utskrivendeLege;
  protected int pasientId;
  protected int reit;

  protected Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId){
    this.legemiddel = legemiddel;
    this.utskrivendeLege = utskrivendeLege;
    this.pasientId = pasientId;
    ++teller; //oppdaterer telleren slik at neste resept får en ny id.
  }

  protected int hentId(){
    return id;
  }

  protected Legemiddel hentLegemiddel(){
    return legemiddel;
  }

  protected Lege hentLege(){
    return utskrivendeLege;
  }

  protected int hentPasientId(){
    return pasientId;
  }

  protected int hentReit(){
    return reit;
  }

  public boolean bruk(){
    if (reit >= 1){
      reit--;
      return true;
    }else{
      return false;
    }
  }

  abstract public String farge();


  abstract public double prisAaBetale();

  @Override
  public String toString(){
    return "toString\nid " + id +
    "\nlege " + utskrivendeLege + "\npasientid " + pasientId + "\nreit " +
    reit + "\nlegemiddel: " + legemiddel;
  }
}
