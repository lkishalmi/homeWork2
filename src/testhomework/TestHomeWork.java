package testhomework;


public class TestHomeWork {
    private static final Integer THE_ULTIMATE_ANSWER = Integer.valueOf(42);

 
    public Integer ultimateAnswer() {
        return THE_ULTIMATE_ANSWER;
    }

    
    public boolean isMore(final Integer input) {
        boolean isTheUltimateAnswer = isTheUltimateAnswer(input);
        if (!isTheUltimateAnswer) {
            throw new IllegalStateException("Nothing can be more than the ultimate answer!");
        }
        return isTheUltimateAnswer;
    }

    
    public boolean isTheUltimateAnswer(final Integer input) {
        return THE_ULTIMATE_ANSWER.equals(input);
    }
}
