package C_Momento;

public class EditorState {
    private final String content; // we made it final so cannot be able to change it by mistake

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
