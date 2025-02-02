package seedu.academydirectory.logic.parser;

import static seedu.academydirectory.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.academydirectory.logic.commands.RevertCommand;
import seedu.academydirectory.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new RevertCommand object
 */
public class RevertCommandParser implements Parser<RevertCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the RevertCommand
     * and returns a RevertCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public RevertCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, RevertCommand.MESSAGE_USAGE));
        }

        return new RevertCommand(trimmedArgs);
    }
}
