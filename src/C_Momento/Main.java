package C_Momento;

public class Main {
    public static void main(String[] args){
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("A");
        history.push(editor.createState());
        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");
        editor.restor (history.pop());

        System.out.println(editor.getContent());
    }
}
