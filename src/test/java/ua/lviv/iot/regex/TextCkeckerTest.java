package ua.lviv.iot.regex;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.regex.TextEditor;

class TextEditorTest {

    @Test
    void checkPatternsTest() {
        System.out.println("Enter amount of the words");
        int scannedInt = TextEditor.scanInt();
        System.out.println("Enter text to check");
        String scannedText = TextEditor.scanString();
        TextEditor.deleteSentences(scannedInt, scannedText);
    }

}