package C_Momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states  = new ArrayList<>();  //we can use stack at its place to make it better

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
      EditorState state =  states.get(states.size()-1);
      states.remove(states.size()-1);
      return  state;
    }
}
