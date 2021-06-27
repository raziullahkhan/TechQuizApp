
package TechQuizApp.pojo;

public class Question {
    private String examId;
    private int qno;
    private String language;
    private String answer1,answer2,answer3,answer4;
    private String correctAnswer;
    private String question;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question(String examId, int qno, String language,  String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
        this.examId = examId;
        this.qno = qno;
        this.language = language;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public Question() {
        
    }

    @Override
    public boolean equals(Object obj) {
        Question other=(Question) obj;
        if(this.examId.equals(other.examId)==false){
            return false;
        }
        if(this.qno!=other.qno){
            return false;
        }
        if(this.question.equals(other.question)==false){
            return false;
        }
        if(this.answer1.equals(other.answer1)==false){
            return false;
        }
        if(this.answer2.equals(other.answer2)==false){
            return false;
        }
        if(this.answer3.equals(other.answer3)==false){
            return false;
        }
        if(this.answer4.equals(other.answer4)==false){
            return false;
        }
        if(this.correctAnswer.equals(other.correctAnswer)==false){
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "examId=" + examId + ", qno=" + qno + ", language=" + language + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", question=" + question + '}';
    }

  
     
    
}
