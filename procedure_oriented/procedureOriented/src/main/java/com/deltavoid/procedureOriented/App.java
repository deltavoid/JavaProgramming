package com.deltavoid.procedureOriented;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void displayArgs(String[] args)
    {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }




    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        displayArgs(args);

        TryVariables.main();

        TryArray.main();

        // TryString.main();

        // PrintExample.printAsicsII();

        PrintExample.printTriangle();

        PrintExample.printZ();

    }

}
