import java.util.Stack;

public class validparenthess {

    public static void main(String[] args) {
        System.out.println( isValid("[]"));
    }

    static boolean isValid(String s){
        Stack<Character> sk = new Stack<>();
        for(int i= 0;i<s.length();i++){
            char c = s.charAt(i);
            if(isOpening(c)){
                sk.push(c);

            }else{
                if(sk.empty()){
                    return false;
                }else if(!isMatching(sk.peek(),c)){
                    return false;
                }else{

                    sk.pop();
                }

            }

        }
        return sk.empty();
    }
    static boolean isOpening(char c){
      return c == '[' || c== '{'||  c== '(';
    }
    static boolean isMatching(char characterfirst, char charactersecond){
        return ( characterfirst=='(' && charactersecond==')' ) || (characterfirst=='{' && charactersecond=='}') || (characterfirst=='[' && charactersecond==']');
    }
}
