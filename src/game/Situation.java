package game;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dP,dL,dR;
    public Situation (String subject, String text, int variants, int dp,int dl,int dr) {
        this.subject=subject;
        this.text=text;
        dP=dp;
        dL=dl;
        dR=dr;
        direction=new Situation[variants];
    }
}