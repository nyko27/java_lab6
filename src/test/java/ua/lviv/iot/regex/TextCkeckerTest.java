package ua.lviv.iot.regex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.regex.TextEditor;

class TextEditorTest {

    @Test
    void checkPatternsTest() {
        System.out.println("Enter amount of the words");
        int scannedInt = TextEditor.scanInt();
        System.out.println("Enter text to check");
        String scannedText = TextEditor.scanString();
        TextEditor.printEditedText(scannedInt, scannedText);
    }

    @Test
    void checkPatternTestAsserting() {
        assertEquals("Text: more, more and more text ! Sentence .",
                TextEditor.deleteSentences(3, "Two words ! Text: more, more and more text ! Sentence ."));
    }

}