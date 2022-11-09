
import java.util.HashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private HashSet<HealthcareServiceable> members = new HashSet<HealthcareServiceable>();

    public void addMember(HealthcareServiceable member) {
        this.members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        this.members.remove(member);
    }

    @Override
    public void service() {
        // TODO Auto-generated method stub
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        int price = 0;
        for (HealthcareServiceable member : members) {
            price += member.getPrice();
        }
        return price;
    }

}