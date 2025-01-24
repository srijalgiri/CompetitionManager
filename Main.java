import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Name name1= new Name("Alice","Green");
        Name name2= new Name("Bob","Brown");
        Name name3= new Name("Carol","White");
        Name name4= new Name("David","Black");
    
        Competitor C1= new Competitor(200, name1, "Beginner", 18);
        Competitor C2= new Competitor(201, name2, "Intermediate", 19);
        Competitor C3= new Competitor(202, name3, "Advanced", 20);
        Competitor C4= new Competitor(203, name4, "Advanced", 23);      

        ArrayList<Competitor> competitors= new ArrayList<>();
        competitors.add(C1);
        competitors.add(C2);
        competitors.add(C3);
        competitors.add(C4);

        System.out.println("Full details of  Competitors:\n");
        for(Competitor competitor:competitors){
            System.out.println(competitor.getFullDetails());
        }

        System.out.println("\n Short details of competitors:\n");
        for(Competitor competitor:competitors){
            System.out.println(competitor.getShortDetails());
        }
    }
}
