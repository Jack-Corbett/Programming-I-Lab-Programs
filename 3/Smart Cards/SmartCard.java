public class SmartCard {
    String owner;
    Boolean staff;
    SmartCard(String name) {
        owner = name;
        staff = false;
    }
    
    String getOwner() {
        return owner;
    }
    
    Boolean isStaff() {
        return staff;
    }
    
    void setStaff(Boolean staffStatus) {
        staff = staffStatus;
    }
}