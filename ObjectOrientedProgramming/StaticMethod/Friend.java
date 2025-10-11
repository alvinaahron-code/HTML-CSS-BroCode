package StaticMethod;

public class Friend {

    String name;
    static int numOfFriends = 0;


    Friend (String name) {
        this.name = name;
        numOfFriends++;
    }

    // You can only include static variables, so this.name will not work
    // Notice how it isn't this.numOfFriends, since the attribute numOfFriends belongs to the class
    // You don't need this.numOfFriends
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " total friends");
    }

    
}
