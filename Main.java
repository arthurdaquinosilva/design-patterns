import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Content 1");
        history.push(editor.createState());

        editor.setContent("Content 2");
        history.push(editor.createState());

        editor.setContent("Content 3");
        history.push(editor.createState());

        editor.setContent("Content 4");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
