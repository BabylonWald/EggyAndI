class Vanlig extends Legemiddel{
  public Vanlig(String navn, double pris, double virkestoff){
    super(navn, pris, virkestoff);
  }

  public String toString(){
    return "\n Vanlig via toString" + "\nid: " +id + "\nnavn: " + navn +
    "\npris: " + pris + "\nvirkestoff: " + virkestoff;
  }
}
