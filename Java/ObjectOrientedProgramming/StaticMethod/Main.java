package StaticMethod;

public class Main {
    public static void main(String[] args) {
        // Static = Makes a variable or method belong to the class rather than to specific object
        // Commonly used for utility methods or shared resources
        // Example of shared resources: Math.round (Math class) round is a static method
        // We use round method by calling the Math class instead of creating an object math1.round which is silly

        Friend friend1 = new Friend("Asta");
        Friend friend2 = new Friend("Yuno");
        Friend friend3 = new Friend("Yami");
        Friend friend4 = new Friend("Mimosa");
        Friend friend5 = new Friend("Nacht");

        // Without using static in Friend.java int numOfFriends, 
        // both of them outputs 1 friend despite have 2 friend objects
        // Remove the comment in the code line to see how it works

        // System.out.println(friend1.name + " has " + friend1.numOfFriends + " friend/s");
        // System.out.println(friend2.name + " has " + friend2.numOfFriends + " friend/s");

        // With static, we use the class name instead of object name
        // From friend1.numOfFriends to Friend.numOfFriends
        System.out.println("\n===== FRIENDS =====");
        System.out.println("You have " + Friend.numOfFriends + " friends");
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println("----------------------------------------------------");

        // Instead of friend1.showFriends(), since it is a static method we will use the class name
        // Friend.showFriends()
        Friend.showFriends();

        // If you're wondering why it says 5 friends. Nacht was included we just did not output the name
        // Since we added another Friend object and called the constructor (Nacht) using the Friend.java class
        // Where we can see if the Friend() Object is called then numOfFriends++

    }
    
}
