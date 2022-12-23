package javadeveloper;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(new Gson().toJson(
                new User("Andrii", "Syrnyk")
        ));
    }
}
