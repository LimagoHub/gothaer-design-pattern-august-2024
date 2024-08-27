package command;

public class CommandHistory
{
    public void insertCommand(Command command) {
        if(command.isQuery()) return;

        // Insert Code here
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }
}
