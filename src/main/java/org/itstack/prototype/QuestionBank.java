package org.itstack.prototype;

import org.itstack.prototype.util.Topic;
import org.itstack.prototype.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class QuestionBank implements Cloneable {
    private String candidate;
    private String number;

    private List<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
    private List<AnswerQuestion> answerQuestionList = new ArrayList<>();

    public QuestionBank() {
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<ChoiceQuestion> getChoiceQuestionList() {
        return choiceQuestionList;
    }

    public void setChoiceQuestionList(List<ChoiceQuestion> choiceQuestionList) {
        this.choiceQuestionList = choiceQuestionList;
    }

    public List<AnswerQuestion> getAnswerQuestionList() {
        return answerQuestionList;
    }

    public void setAnswerQuestionList(List<AnswerQuestion> answerQuestionList) {
        this.answerQuestionList = answerQuestionList;
    }

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        //题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);

        //答案乱序
        List<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("candidate: " + candidate + "\r\n" + "number: " + number + "\r\n" + "--------------------------------------------\r\n" + "Part A choice question" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("No.").append(idx + 1).append("question: ").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append(": ").append(option.get(key)).append("\r\n");
            }
            detail.append("answer").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        detail.append("Part B answer question" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("No.").append(idx + 1).append("question: ").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("answer: ").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}