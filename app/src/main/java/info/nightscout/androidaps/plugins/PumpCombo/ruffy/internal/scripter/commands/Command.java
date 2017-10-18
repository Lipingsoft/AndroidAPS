package info.nightscout.androidaps.plugins.PumpCombo.ruffy.internal.scripter.commands;

import java.util.List;

import info.nightscout.androidaps.plugins.PumpCombo.ruffy.internal.scripter.RuffyScripter;
import info.nightscout.androidaps.plugins.PumpCombo.ruffy.spi.CommandResult;

/**
 * Interface for all commands to be executed by the pump.
 * <p>
 * Note on cammond methods and timing: a method shall wait before and after executing
 * as necessary to not cause timing issues, so the caller can just call methods in
 * sequence, letting the methods take care of waits.
 */
public interface Command {
    CommandResult execute();
    List<String> validateArguments();
    void setScripter(RuffyScripter scripter);
}
