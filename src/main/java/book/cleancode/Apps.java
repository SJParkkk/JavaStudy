package book.cleancode;

public class Apps {
    public static void main(String[] args) {
        CodeAnalyzer  codeAnalyzer = new CodeAnalyzer(0);
        int codeLineCount = codeAnalyzer.getLineCount();
        System.out.println(codeLineCount);
    }
}
