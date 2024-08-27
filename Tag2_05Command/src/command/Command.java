package command;

import java.io.Serializable;

public interface Command extends Serializable {
    void parse(String [] tokens);
    void execute();
    void undo();
    boolean isQuery();
}
