package BasicsAndBinarySearch;

public class AccessPubMethOfPvtClass {

    private  class InnerAccess {
        public void display() {
            System.out.println("Inside display.");
        }
    }
    public  void createInnerObject() {
        InnerAccess innerAccess = new InnerAccess();
        innerAccess.display();
    }
    public static void main(String args[]) {
        AccessPubMethOfPvtClass accessPubMethOfPvtClass = new AccessPubMethOfPvtClass();
        accessPubMethOfPvtClass.createInnerObject();;
    }
}
