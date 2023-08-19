package C_Momento;


public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // editor should have capability to store its current state
    public EditorState createState(){
        return new EditorState(content);
    }

    // editor should be able to restore its previous state
    public void restor(EditorState state){
        content = state.getContent();
    }
}
