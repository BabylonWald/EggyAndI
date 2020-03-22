class Vanedannende extends Legemiddel{
  int styrke;

  public Vanedannende(String navn, double pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    this.styrke = styrke;
  }

  protected int hentVanedannendeStyrke(){
    return styrke;
  }

  public String toString(){
    return "\n Vanedannende via toString" + "\nid: " +id + "\nnavn: " + navn +
    "\npris: " + pris + "\nvirkestoff: " + virkestoff + "\nstyrke:" + styrke;

  }

}
