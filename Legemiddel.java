abstract class Legemiddel{

  protected static int teller = 0;
  protected int id = teller;
  protected String navn;
  protected double pris;
  protected double virkestoff;

  protected Legemiddel(String navn, double pris, double virkestoff){
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
    teller += 1;
  }
  protected int hentId(){
    return id;
  }

  protected String hentNavn(){
    return navn;
  }

  protected double hentPris(){
    return pris;
  }

  protected double hentVirkestoff(){
    return virkestoff;
  }

  protected void settNypris(double pris){
    this.pris = pris;
  }

}
