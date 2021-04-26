package book.cleancode;

public class CodeAnalyzer{
    private int lineCount;

    public int getLineCount() {
        return lineCount;
    }

    public CodeAnalyzer(int lineCount) {
        this.lineCount = lineCount;
        doSomething();
    }

    private void addLineCount(){
        lineCount++;

    }
    private void doSomething(){
        for (int i = 0; i < 5; i++) {
            System.out.println("do something");
            addLineCount();
        }

    }
}
