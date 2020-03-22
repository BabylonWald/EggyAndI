class Narkotisk extends Legemiddel{
  int styrke;

  public Narkotisk(String navn, double pris, double virkestoff, int styrke){
    super(navn, pris, virkestoff);
    this.styrke = styrke;
  }

  protected int hentNarkotiskStyrke(){
    return styrke;
  }

  public String toString(){
    return "\n Narkotisk via toString" + "\nid: " +id + "\nnavn: " + navn +
    "\npris: " + pris + "\nvirkestoff: " + virkestoff + "\nstyrke:" + styrke;

  }
}
