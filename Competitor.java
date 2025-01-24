public class Competitor {
    private int competitorID;
    private Name name;
    private String competitionLevel;
    private int age;

    public Competitor(int competitorID, Name name, String competitionLevel,int age){
        this.competitorID=competitorID;
        this.name=name;
        this.competitionLevel=competitionLevel;
        this.age=age;
    }
    public int getCompetitorID(){
        return competitorID;
    }
    public void setCompetitorID(int competitorID){
        this.competitorID=competitorID;
    }

    public Name getName(){
        return name;
    }
    public void setName(Name name){
        this.name=name;
    }

    public String getCompetitionLevel(){
        return competitionLevel;
    }
    public void setLevel(String competitionlevel){
        this.competitionLevel=competitionlevel;
    }

    public int getAge(){
        return age;
    }
    public void setAttribute(int age){
        this.age=age;
    }

    public double getOverallScore(){
        return 5.0;
    }

    public String getFullDetails(){
        return "Competitor Number " + competitorID+
        ", Name "+name+
        ", Level: " +competitionLevel+
        ", Age: "+ age +
        " , Overall Score: " +getOverallScore();
    }

    public String getShortDetails(){
        return "CN" + competitorID + "("+name.getInitial()+") has overalll score of " +getOverallScore();
    }
}
