package org.itstack.prototype;

import org.junit.jupiter.api.Test;

public class test_QuestionBank {
    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new
                QuestionBankController();
        System.out.println(questionBankController.createPaper("James",
                "1000001921032"));
        System.out.println(questionBankController.createPaper("xiao wang",
                "1000001921051"));
        System.out.println(questionBankController.createPaper("xiaoliu",
                "1000001921987"));
    }
}
