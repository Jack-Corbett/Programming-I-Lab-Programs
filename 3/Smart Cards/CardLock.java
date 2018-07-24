public class CardLock {
    SmartCard lastCardSeen;
    Boolean cardUnlocked = false;
    Boolean studentAccess = false;
    
    void swipeCard(SmartCard card) {
        lastCardSeen = card;
    }
    
    SmartCard getLastCardSeen() {
        return lastCardSeen;
    }
    
    Boolean isUnlocked() {
        //First check that a card has been scanned
        if (lastCardSeen != null) {
            //Now check if the card owner is a staff member
            if (lastCardSeen.isStaff()) {
                cardUnlocked = true;
            //Then check if the card lock accepts student cards
            } else if (studentAccess) {
                cardUnlocked = true;
            } else {
                //Default to locked state
                cardUnlocked = false;
            }
        } return cardUnlocked;
    }
    
    void toggleStudentAccess() {
        studentAccess = !studentAccess;
    }
}