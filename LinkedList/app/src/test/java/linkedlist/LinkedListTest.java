package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

//    @Test
//    void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }


      @Test void returnsEmptyLinkedList(){
            App sut = new App();
            LinkedList ll =new LinkedList();

            Assertions.assertEquals("Null", ll.toString());
      }

      @Test void insertNodeToHeadOfLinkedlist(){
            App sut = new App();
            LinkedList ll =new LinkedList();
            ll.insert(10);


            String result = ll.toString();

            Assertions.assertEquals("{10}->Null", result);

      }

      @Test void checkHeadPointer(){
            App sut = new App();
            LinkedList ll =new LinkedList();
            ll.insert(10);
              int result = ll.head.value;
            Assertions.assertEquals(10, result);


      }

      @Test void insertMultipleNodeToHeadOfLinkedlist(){
            App sut = new App();
            LinkedList ll =new LinkedList();
            ll.insert(10);
            ll.insert(15);
            ll.insert(20);
            ll.insert(25);
            ll.insert(30);

            String result = ll.toString();

            Assertions.assertEquals("{30}->{25}->{20}->{15}->{10}->Null", result);

      }

      @Test void includes_checkIfValueIncludedInLinkedlist(){

            App sut = new App();
            LinkedList ll =new LinkedList();
            ll.insert(10);
            ll.insert(15);
            ll.insert(20);
            ll.insert(25);
            ll.insert(30);

            boolean result = ll.includes(5);
            Assertions.assertEquals(false , result);
             result = ll.includes(10);
            Assertions.assertEquals(true , result);
      }


}
