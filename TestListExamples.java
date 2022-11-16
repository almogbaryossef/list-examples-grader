import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.*;

// class ListExampless implements StringChecker {
//   public boolean checkString(String s) {
//     if(s.length() > 5) {
//       return true;
//     }
//     return false;
//   }
// }

public class TestListExamples {

  @Test
  public void testFilter() {
    List<String> lst = new ArrayList<String>();
    lst.add("hello");
    lst.add("consequence");
    lst.add("shannanigans");
    lst.add("flower");
    lst.add("code");
    lst.add("carrot");

    StringChecker sc = new StringChecker() {
      public boolean checkString(String s) {
            if(s.length() > 5) {
              return true;
            }
            return false;
      }
    };
      
    List<String> result = new ArrayList<String>();
    result.add("consequence");
    result.add("shannanigans");
    result.add("flower");
    result.add("carrot");

    assertArrayEquals(result.toArray(), ListExamples.filter(lst, sc).toArray());

  }

  @Test
    public void testMerge() {
        List<String> lst1 = new ArrayList<String>();
        List<String> lst2 = new ArrayList<String>();
        lst1.add("a");
        lst2.add("b");
        lst1.add("c");
        lst2.add("d");
        lst1.add("e");
        lst2.add("f");

        List<String> result = new ArrayList<>();
        result.add("a");
        result.add("b");
        result.add("c");
        result.add("d");
        result.add("e");
        result.add("f");

        assertArrayEquals(result.toArray(), ListExamples.merge(lst1, lst2).toArray());
    }
}
