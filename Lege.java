class Lege{
  String navn;

  public Lege(String navn){
    this.navn = navn;
  }

  public String hentNavn(){
    return navn;
  }

  public String toString(){
    return "navn: " + navn;
  }
}
