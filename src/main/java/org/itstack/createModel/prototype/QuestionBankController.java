package org.itstack.createModel.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * It will provide a different test for every user
 */
public class QuestionBankController {
    private QuestionBank questionBank = new QuestionBank();

    public QuestionBankController() {
        Map<String, String> map01 = new HashMap<>();
        map01.put("A", "Guido van Rossum");
        map01.put("B", "James Gosling");
        map01.put("C", "Dennis Ritchie");
        map01.put("D", "Bjarne Stroustrup");

        Map<String, String> map02 = new HashMap<>();
        map02.put("A", "Java is a sequence-dependent programming language");
        map02.put("B", "Java is a code dependent programming language");
        map02.put("C", "Java is a platform-dependent programming language");
        map02.put("D", "Java is a platform-independent programming language");

        Map<String, String> map03 = new HashMap<>();
        map03.put("A", "JRE");
        map03.put("B", "JIT");
        map03.put("C", "JDK");
        map03.put("D", "JVM");

        Map<String, String> map04 = new HashMap<>();
        map04.put("A", "Object-oriented");
        map04.put("B", "Use of pointers");
        map04.put("C", "Portable");
        map04.put("D", "Dynamic and Extensible");

        Map<String, String> map05 = new HashMap<>();
        map05.put("A", " identifier & keyword");
        map05.put("B", "identifier");
        map05.put("C", "keyword");
        map05.put("D", "none of the mentioned");

        questionBank.append(new ChoiceQuestion("Who invented Java Programming", map01, "B"))
                .append(new ChoiceQuestion("Which statement is true about Java", map02, "D"))
                .append(new ChoiceQuestion("Which component is used to compile, debug and execute the java programs", map03, "C"))
                .append(new ChoiceQuestion("Which one of the following is not a Java feature", map04, "B"))
                .append(new ChoiceQuestion("Which of these cannot be used for a variable name in Java", map05, "C"))
                .append(new AnswerQuestion("What is the extension of java code files", ""))
                .append(new AnswerQuestion("how many legs a person", "2"))
                .append(new AnswerQuestion("what's gas human need", "oxygen"));
    }

    public String createPaper(String candidate, String number) throws CloneNotSupportedException {
        QuestionBank questionBankClone = (QuestionBank) questionBank.clone();
        questionBankClone.setCandidate(candidate);
        questionBankClone.setNumber(number);
        return questionBankClone.toString();
    }

}
