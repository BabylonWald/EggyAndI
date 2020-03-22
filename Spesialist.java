class Spesialist extends Lege implements Godkjenningsfritak{
  private int kontrollID;

  public Spesialist(String navn, int kontrollID){
    super(navn);
    this.kontrollID = kontrollID;
  }

  public int hentKontrollID(){
    return kontrollID;
  }

  @Override
  public String toString(){
    return "navn: " + navn +"\nkontroll ID: " + kontrollID;
  }
}
