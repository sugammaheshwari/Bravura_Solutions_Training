package Day6;

public class CustomStackmain
{
    public static void main(final String[] args) {
        final CustomStack<Integer> st = new CustomStack<Integer>();
        final CustomStack<String> st2 = new CustomStack<String>();
        st2.pop();
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.push("ewowow");
        st2.pop();
        st2.pop();
    }
}