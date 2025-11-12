package main.java.com.fezor.behavioral.command.textEditorCommandsExample.commands;

import main.java.com.fezor.behavioral.command.textEditorCommandsExample.editor.Editor;

public class CopyCommand extends Command{
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
