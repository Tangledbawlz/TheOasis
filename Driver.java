import java.util.Scanner;


public class Driver {


    public static void main(String[] args) {

        System.out.println("Welcome! What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if(name.equalsIgnoreCase("Askalad"))
        {
            System.out.println("You're under arrest for treason, and for intentions of war!\nYou Lose!");
            System.exit(0);
        }
        else
            System.out.println("Welcome " + name + ". This choose your own adventure will take place in a far away place.");


        System.out.println("This takes place in a city called, 'The Oasis.' There are many Humans, Elves, Tieflings and Half-Orcs\nliving in this city." +
                " They were all attending in hopes to meet Askalad. Askalad was the 'leader' of the city faction. In reality, he was undercover for another country,\n" +
                "and they were planning to overthrow our government and create a war. \"" + name + "\" it's your job to uncover information about his whereabouts, and\n" +
                "stop him from being able to do anything to our country.");
        System.out.print("Do you take the mission? Type Y/N to respond: ");
        String response = in.nextLine();
        System.out.println();
        if(response.equalsIgnoreCase("y")) {
            System.out.println("Great. You will begin tomorrow. Everything is paid for, and we will see you in the morning.");
        }
        else
        {
            System.out.println("Great. You will begin tomo.... Everything is paid for already, and you cannot refuse. This is your country as well. We will see you in the morning.");
            System.out.println("You are definitely getting a gold and silver reduction.");
        }
        System.out.println("\n\nWake up!!!! It's already 10 a.m.! If you don't get up you'll be late!!!");
        System.out.println("Do you get up? Y/N?");
        String wakeup = in.nextLine();
        if(wakeup.equalsIgnoreCase("y"))
        {
            System.out.println("You have breakfast get dressed, and head to your rendezvous location.");
        }
        else
        {
            System.out.println("You wake up roughly around noon, and don't feel like going anywhere.");
            System.out.println("HEY!!!!! WAKE UP " + name + "!!! You are so late, so you don't get to eat breakfast! The preparations are ready, so you leave now. You have 15 minutes.");
        }
        System.out.print("\n*Later in the day*\n");

        System.out.println("Today, we have a few missions to select from. In the North, there is a Death-worm mother who has been creating a stir and recently has been giving birth to many\n" +
                "new Death-worm children. We have to take care of this before it becomes a problem.\n" +
                "To the East, we heard of a gang of 4 bandits who are harassing women, and stealing their purses.\n" +
                "To the West, we have reports of several missing persons. We don't have much information on this case.\n" +
                "To the South, there is an outbreak of some unknown virus that is making the sleep schedule of a regular person flip. From sleeping 8 hours, to sleeping 16 hours, and only awake for 8.");
        System.out.println("Which direction do you choose?\n " +
                "North: N\n" +
                "South: S\n" +
                "East: E\n" +
                "West: W\n");
        String mission = in.nextLine();
        if(mission.equalsIgnoreCase("N"))
        {
            System.out.println("As you go North towards the Death-worm's last seen location in the desert, you hear \n" +
                    "a strange noise that can only be described as a rush of water down a hill. It becomes\n" +
                    "very cold, and the earth around you begins shaking violently. You can only think of one thing\n" +
                    "It's the Death-worm...\n\n");
            System.out.println("You got eaten by the Death-worm as it flew upward into the sky like a shark attacking\n" +
                    "it's prey.\n" +
                    "Thankfully you were able to live, and you woke up in a big pile of some weird substance...*That's gross* You think to yourself.");
            System.out.println("When you finally get up, and feel more recovered, you get up and begin looking for the Death-worm again.\n" +
                    "You walk around the desert, and for several hours you wonder looking for the worm, and are unable to find it. You decide to\n" +
                    "rest for the night. Unsure of what was going on through the day. You wake up and continue looking. This continues for a week\n" +
                    "and the Death-worm was completely gone.\n" +
                    "You return to the town and decide to take another mission, but for some reason, as you are walking towards the city, you are unable\n" +
                    "to leave the desert area. What is going on, you think to yourself...");
        }
        if(mission.equalsIgnoreCase("S"))
        {
            System.out.println("Commander: So, you've decided to go the path of the unknown and head South?\n" +
                    "you ponder to yourself before you head out.\nDo you really want to go? Y/N?");
            String decide = in.nextLine();
            if(decide.equalsIgnoreCase("Y"))
            {
                System.out.println("Commander: Very well, I won't stop you. I'm sorry for your loss. When you return, you will still be working your FULL hours, so I hope you keep that in mind....\n" +
                        "Oh and take this. It might be useful. Your commander gives you a weird shiny bag that seems like it may be bottomless, and think nothing of it.\n" +
                        "You head out to the outskirts of the city where it looks like a ghost town, and there is no one in sight. You see some Half-Orcs playing with some dogs and asked them if they were\n" +
                        "affected by the outbreak. They responded with\n" +
                        "Orcs: No, we were sent out here to find out what happened, and how it started since it mostly affects Humans and Elves. Why did you come knowing the consequences? Are you dumb?\n" +
                        "Well never mind. Since you are here, you'll help us. We think we found a cure so we have to get the materials for it as soon as possible.\n" +
                        "The Orcs give you a list.\n" +
                        "Orcs: These are the list of materials, and ingredients that we need in order to craft this recipe. Is there anything you have with you that make be of use?\n" +
                        "You pull out of your inventory something you were given earlier by your commander. You tell the Orcs\n" +
                        "I don't know what this is, but my commander gave me this bag earlier and said it may be of use. As you reach in the bag, you can't feel anything. You open it and look inside.\n" +
                        "It really is bottomless. Its a Bag Of Holding! Inside was all of the materials needed to cure the people of their sickness. You take everything out and begin preparations.\n" +
                        "You think to yourself about how critical it is to get this done as soon as possible due to the people overly sleeping. If they wake up, and go back to sleep before giving them\n" +
                        "the recipe, they will sleep for another 16 hours and you will have to wait for them.\n\n" +
                        "Thankfully you finished halfway through when everyone woke up. Along the way of crafting this item, you find a beautiful woman and you become well acquainted with her. She tells\n" +
                        "you her name, it was: ");
                String wife = in.nextLine();
                System.out.println("Ahhh yes her name was " + wife + ". You feed everyone the medicine and to your surprise, it works on everyone, but now you have the symptoms. " + wife + " helps you retrieve the ingredients\n" +
                        "again after you left the town. You two plan to get married and she plans to come with you away from the main city. She knew about the coup d'etat and was hoping that she could overthrow it, but\n" +
                        "Askalad knew about her little plan and was able to stop her. She then tried to have her town help, and coincidentally the city then had this outbreak occur. It was very suspicious, but she\n" +
                        "devoted her time to you, and wanted to work with you to get rid of Askalad in order to protect her city.\n" +
                        "To be Continued" );
            }
            if(decide.equalsIgnoreCase("N"))
            {
                System.out.println("Commander: Well then I don't blame you. but are you gonna choose something else now?\n" +
                        "You think to yourself all the wonderful things you probably missed and the chances that are now gone. Awell, you think to yourself. I guess I'll head North instead since its the opposite direction.");
                System.out.println("As you go North towards the Death-worm's last seen location in the desert, you hear \n" +
                        "a strange noise that can only be described as a rush of water down a hill. It becomes\n" +
                        "very cold, and the earth around you begins shaking violently. You can only think of one thing\n" +
                        "It's the Death-worm...\n\n");
                System.out.println("You got eaten by the Death-worm as it flew upward into the sky like a shark attacking\n" +
                        "it's prey.\n" +
                        "Thankfully you were able to live, and you woke up in a big pile of some weird substance...*That's gross* You think to yourself.");
                System.out.println("When you finally get up, and feel more recovered, you get up and begin looking for the Death-worm again.\n" +
                        "You walk around the desert, and for several hours you wonder looking for the worm, and are unable to find it. You decide to\n" +
                        "rest for the night. Unsure of what was going on through the day. You wake up and continue looking. This continues for a week\n" +
                        "and the Death-worm was completely gone.\n" +
                        "You return to the town and decide to take another mission, but for some reason, as you are walking towards the city, you are unable\n" +
                        "to leave the desert area. What is going on, you think to yourself...");
                System.out.println("Things could've been different. Maybe I could've got married, or helped a city or something. Maybe I should've gone another path. Or maybe I\n" +
                        "should've just done what I chose first. It isn't good to second guess yourself, or stray from helping others.\n\n" +
                        "You wake up in a hospital a few days later, on the brink of death. I guess the Oasis isn't called Death Valley for nothing...wait, that's not what it's called\n" +
                        "The End");
            }
        }
        if(mission.equalsIgnoreCase("E"))
        {
            System.out.println("You head East, towards the bandits with a motherload of weapons. You took all of Texas' guns and became a hitman for the bandits.\n" +
                    "You look around for them, but all you see are a group of teenagers chilling by a fire pit. AS you get closer, you notice that they are actually all grown men, but they\n" +
                    "are just small. You walk up to them and ask if they've seen any suspicious behavior from any individuals. They respond.\n" +
                    "Suspicious Men: *snarks* You commoner, who do you think you are questioning? We are the big band of bandits causing a stir, and if you know what's best for you, you better leave.\n" +
                    "You then pull out ALL of the weapons you took with you and began shooting everything at them. Every bullet you shot at them was reduced to ashes, and they were confused at what you\n" +
                    "had fired at them. You then realize that this is a different world. You take out a replica wand from a board game you play and point it at them.\n" +
                    "AHHHHHH! IS HE THE BLACK WIZARD WE HAVE HEARD ABOUT!?\n" +
                    "Although extremely confused as you are only wearing a black T-Shirt, you say that you are, and they better leave the people alone before you do something to them. They stand up and run away.\n" +
                    "Huh, I'm glad they left, I think they were tieflings or something.\n" +
                    "You turn around and see what is actually the Black Wizard they were talking about. It is a 9ft Dragonborne wearing a lightless cloak that no light reflected from.\n" +
                    "This is dangerous, you think to yourself.\n" +
                    "He says to you in a very hushed growl. Thank you warrior, I need not soil my hands with anymore blood of tryhard thugs. He then looks at your guns, and offers a ridiculous amount of gold and silver\n" +
                    "for just a single revolver that he was intrigued with. Although he didn't know how to reload it, he was amused with the work of such a weapon.\n" +
                    "Black Wizard: Farewell soldier, and safe travels. Thank you for your help and this magnificent artifact!");
            System.out.println("You head back to your outpost unsure if that was a good idea, but now you can retire, and the next several generations of your family will never have to work again...\n" +
                    "This was definitely stolen currency...");

        }
        if(mission.equalsIgnoreCase("W"))
        {
            System.out.println("You head to the West of the city, and immediately see storm clouds above that side of the city. You reach  the end of the city and there is a huge fog, or mist that is completely obscuring\n" +
                    "the view and it is difficult to see arms length away. You continue walking what you believe is straight, and you walk out of the fog back to the area you came from. Huh? What was that, you think to yourself.\n" +
                    "How am I suppose to deal with this. You walk back in again and as your walking, you feel moisture at your feet. This is the desert, why is there water? You thought to yourself, until you looked down. It was an\n" +
                    "unbelievable amount of blood on the floor. You begin to vomit in your mouth, and you try to turn around. You seem to be in an enclosed room now. HOW? You think again to yourself. This isn't how this is supposed\n" +
                    "to be, this is not real! You run away, towards where you came from and hit a wall. What is happening here, where am I and why is there so much blood?\n...\nOkay, Okay, think calmly.\n" +
                    "You listen for noises in the area and hear sounds of someone crying. You scan your surroundings of the fog, and walls. Some of the walls are gone now. I think that there is an anomaly of some sort.\n" +
                    "You stumble forward from the wall behind you moving upward and disappearing in the mist. You land face down in the blood mixed soil and as you look up, there is a young child, roughly\n" +
                    "before he became a teen. You run up to him, and you fall again right next to him. You then ask if he is okay, and what he is doing here.\n" +
                    "Child: Please, Don't move from this spot, and don't make me move!\n" +
                    "He was completely distressed and full of fear. You ask him if he knows what's going on, and in the best words he could muster from his crying, he says." +
                    "Corveine: My name is Corveine. My family was moving from the sandy place to the city, but when we got here, we were poor, and the house people kicked us out. We came over here when some mist\n" +
                    "came and now my family is gone. I don't know if they are still alive, but I am too scared to leave.\n" +
                    "You look at the boys stomach, and it looks like he hasn't eaten in a very long time. You could see it in his face, but with all the crying, it was hard to tell. You say to the boy,\n" +
                    "Hey, don't worry. We will find your family and get you out of here! I promise.\n" +
                    "Corveine: O-Okay.");
        }


    }
}
