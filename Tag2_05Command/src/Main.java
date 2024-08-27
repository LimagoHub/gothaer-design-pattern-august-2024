import command.Command;
import command.CommandFactory;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){

            while(true){

                System.out.print("#>");
                String zeile  = scanner.nextLine();
                if(zeile.equals("exit")) break;
                Optional<Command> command = CommandFactory.create(zeile);
                if(command.isEmpty()) continue;
                command.get().execute();

            }



        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}