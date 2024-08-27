import command.Command;
import command.CommandFactory;
import command.CommandHistory;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            final CommandHistory history = new CommandHistory();
            while(true){

                System.out.print("#>");
                String zeile  = scanner.nextLine();
                if(zeile.equals("exit")) break;
                if(zeile.equals("undo")) {
                    history.undo();
                    continue;
                }
                if(zeile.equals("redo")) {
                    history.redo();
                    continue;
                }
                Optional<Command> command = CommandFactory.create(zeile);
                if(command.isEmpty()) continue;
                command.get().execute();
                history.insertCommand(command.get());

            }



        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}