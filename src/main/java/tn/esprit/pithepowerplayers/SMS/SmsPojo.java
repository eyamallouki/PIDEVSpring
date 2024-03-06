package tn.esprit.pithepowerplayers.SMS;

public class SmsPojo {

    private String to;
    private String message;

    private  String  AgencyName;
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public String getAgencyName() {
        return AgencyName;
    }

    public void setAgencyName(String agencyName) {
        this.AgencyName = agencyName;
    }



   // public void setMessage(String message) {
     //   this.message = message;
  //  }

    public void setMessage(String message) {
        // Ajouter l'émoji 🎉 à la fin de la chaîne de message
        this.message = message + " 🎉";
    }
}
