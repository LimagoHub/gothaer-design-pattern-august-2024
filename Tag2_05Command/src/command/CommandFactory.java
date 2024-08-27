package command;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class CommandFactory {

    private static final String PREFIX = "command.";
    private static final String SUFFIX = "Command";

    public static Optional<Command> create(String zeile) {
        try {
            return createImpl(zeile);
        } catch (Throwable e) {
            System.out.println("unbekannter Befehl");
            return Optional.empty();
        }
    }

    private static Optional<Command> createImpl(final String zeile) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        String [] tokens = zeile.split(" ");
        Command result = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).getConstructor().newInstance();
        result.parse(tokens);
        return Optional.of(result);
    }
}
