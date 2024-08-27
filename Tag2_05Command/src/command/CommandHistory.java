package command;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CommandHistory
{

    private final Deque<Command> undableCommands = new ArrayDeque<>();
    private final Deque<Command> redoableCommands = new ArrayDeque<>();

    public void insertCommand(Command command) {
        if(command.isQuery()) return;

        undableCommands.push(command);
        redoableCommands.clear();
    }

    public void undo() {
        if(undableCommands.isEmpty()) {
            System.out.println("can't undo");
        } else {
            Command command = undableCommands.pop();
            command.undo();
            redoableCommands.push(command);
        }

    }

    public void redo() {
        if(redoableCommands.isEmpty()) {
            System.out.println("can't redo");
        } else {
            Command command = redoableCommands.pop();
            command.execute();
            undableCommands.push(command);
        }
    }
}
