/**
 * 
 */
package adapater;

/**
 * @author kevin
 *
 */
public class DuckTestDrive {
	
	
	public static void main(String[] args) {
       MallardDuck duck   = new MallardDuck();
       WildTurkey turkey  = new WildTurkey();
       
       Duck turkeyAdapter = new TurkeyAdapter(turkey);
       turkey.gobble();
       turkey.fly();
       
       System.out.println("\n The Duck Says......");
       testDuck(duck);
       
       System.out.println("\n Turkey Adapeter");
       testDuck(turkeyAdapter);
	}

     static void testDuck(Duck duck){
    	 duck.quack();
    	 duck.fly();
     }
 

}
