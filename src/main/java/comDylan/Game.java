package comDylan;

import javax.swing.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class Game implements GameInterface
{
    List<String> al;
    Set<String> setList;
    Map<Integer, String> MapOfColours;
    public void createArrayList(){

        //Using List method from Collection
        al = new ArrayList<String>();
        //add elements to the array list
        al.add("Red");
        al.add("Blue");
        al.add("Pink");
        al.add("Yellow");
        al.add("Green");
        al.add("Orange");
        al.add("Black");
        al.add("Purple");
        al.add("Turqoise");
        al.add("Violet");
    }
    public void createSetList(){
        //Using Set method from Collection
        setList = new HashSet<String>();
        setList.add("Red");
        setList.add("Blue");
        setList.add("Pink");
        setList.add("Yellow");
        setList.add("Green");
        setList.add("Orange");
        setList.add("Black");
        setList.add("Purple");
        setList.add("Turqoise");
        setList.add("Violet");

        System.out.println("Print out of Set values");
        for(String eachColor: setList){
            System.out.println(eachColor);
        }
    }

    public void createMapList(){
        //Using Map method from Collection
        MapOfColours = new HashMap<>();
        MapOfColours.put(5, "Red");
        MapOfColours.put(1, "Blue");
        MapOfColours.put(8, "Pink");
        MapOfColours.put(6, "Yellow");
        MapOfColours.put(4, "Green");
        MapOfColours.put(3, "Orange");
        MapOfColours.put(9, "Black");
        MapOfColours.put(7, "Purple");
        MapOfColours.put(2, "Turqoise");
        MapOfColours.put(0, "Violet");

        System.out.println("Print out of Map Keys");
        for(Integer key: MapOfColours.keySet()){
            System.out.println("Key :" +key);
        }

        System.out.println("Print out of Map Values");
        for(String value: MapOfColours.values()){
            System.out.println("Value :" +value);
        }

}

public void GamePlay(){

    String choice = "";
    String guess = null;
    Random rand = new Random();
    guess = al.get(rand.nextInt(al.size()));

    JOptionPane.showMessageDialog(null, " The color is : "+guess);

    StringBuilder builder = new StringBuilder("<html>");
    builder.append("Please Guess the Color or enter x to cancel:");
    builder.append("\n");
    builder.append("----------------------------------------------------------------------------");
    builder.append("\n");
    for(int counter = 0; counter<al.size(); counter++)
    {
        builder.append(al.get(counter));
        builder.append("\n");
    };
    builder.append("\n");
    builder.append("----------------------------------------------------------------------------");
    builder.append("\n");

    choice = JOptionPane.showInputDialog(builder);


    while(!choice.equalsIgnoreCase("x"))
    {

        if(choice.equalsIgnoreCase(guess))
        {
            JOptionPane.showMessageDialog(null, "Correct !  The color is : "+guess,"Congratulations!!!",JOptionPane.PLAIN_MESSAGE);
            al.remove(guess);
            guess = al.get(rand.nextInt(al.size()));

            builder = null;
            builder = new StringBuilder("<html>");
            builder.append("The Remaning Colors are:");
            builder.append("\n");
            builder.append("----------------------------------------------------------------------------");
            builder.append("\n");
            for(int counter = 0; counter<al.size(); counter++)
            {
                builder.append(al.get(counter));
                builder.append("\n");
            };
            builder.append("\n");
            builder.append("Choose another Color:");
            builder.append("\n");
            builder.append("----------------------------------------------------------------------------");
            builder.append("\n");

            choice = null;
            choice = JOptionPane.showInputDialog(builder);
        } else if(!choice.equalsIgnoreCase(guess))
        {
            JOptionPane.showMessageDialog(null,"Your colour "+choice+"  was incorrect. See the Hints and try again:");
				/*		if(guess.equalsIgnoreCase("Red"))
						{
							JOptionPane.showMessageDialog(null,"The color of your blood");
						}else if(guess.equalsIgnoreCase("Blue"))
								{
									JOptionPane.showMessageDialog(null,"The color of the sky");
								}else if(guess.equalsIgnoreCase("Pink"))
										{
											JOptionPane.showMessageDialog(null,"The color of girls virgina");
										}else if(guess.equalsIgnoreCase("Yellow"))
												{
													JOptionPane.showMessageDialog(null,"The color of the son");
												}else if(guess.equalsIgnoreCase("Green"))
														{
															JOptionPane.showMessageDialog(null,"The color of gras");
														}else if(guess.equalsIgnoreCase("Orange"))
																{
																	JOptionPane.showMessageDialog(null,"The color of the fruit called orange");
																}else if(guess.equalsIgnoreCase("Black"))
																		{
																			JOptionPane.showMessageDialog(null,"The color of death");
																		}else if(guess.equalsIgnoreCase("Purple"))
																				{
																					JOptionPane.showMessageDialog(null,"The color of Barney the dinosaur");
																				}else if(choice.equalsIgnoreCase("Turgoise"))
																						{
																							JOptionPane.showMessageDialog(null,"The color of the bahamas water");
																						}else if(guess.equalsIgnoreCase("Violet"))
																								{
																									JOptionPane.showMessageDialog(null,"The color of Barney's cousin");
																								}


								*/


            switch(guess)  //The switch statement
            {
                case "Red":
                    JOptionPane.showMessageDialog(null,"The color of your blood","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Blue":
                    JOptionPane.showMessageDialog(null,"The color of the sky","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Pink":
                    JOptionPane.showMessageDialog(null,"The color of girls virgina","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Yellow":
                    JOptionPane.showMessageDialog(null,"The color of the son","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Green":
                    JOptionPane.showMessageDialog(null,"The color of gras","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Orange":
                    JOptionPane.showMessageDialog(null,"The color of the fruit called orange","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Black":
                    JOptionPane.showMessageDialog(null,"The color of death","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Purple":
                    JOptionPane.showMessageDialog(null,"The color of Barney the dinosaur","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                case "Turgoise":
                    JOptionPane.showMessageDialog(null,"The color of the bahamas water","Hint",JOptionPane.PLAIN_MESSAGE);
                    break;
                case "Violet":
                    JOptionPane.showMessageDialog(null,"The color of Barney's cousin","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"You have not choosen a colour from the list","Hint",JOptionPane.PLAIN_MESSAGE);
                    choice = JOptionPane.showInputDialog(builder);
            }


        }


    }
}

public List<String> ArrayTest(){
    return al;
}
    public Set<String> SetTest(){
        return setList;
    }

    public Map<Integer, String> MapTest(){
        return MapOfColours;
    }

}
