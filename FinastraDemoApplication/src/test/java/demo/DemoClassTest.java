package demo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fin.demo.DemoClass;

class DemoClassTest {

	 public DemoClass demoClass;

	    @BeforeEach
	    public void setUp() {
	        demoClass = new DemoClass();
	    }

	    @DisplayName("Play DemoClass with number = 1")
	    @Test
	    public void testNumber() {
	        String res = demoClass.play(1);
	        Assertions.assertEquals(res, "1");
		    System.out.println("Test1 completed");
	    }

	    @DisplayName("Play DemoClass with number = 3")
	    @Test
	    public void test3() {
	        String res = demoClass.play(3);
	        Assertions.assertEquals(res, "Divisible by 3");
	    }

	    @DisplayName("Play DemoClass with number = 5")
	    @Test
	    public void test5() {
	        String res = demoClass.play(5);
	        Assertions.assertEquals(res, "Divisible by 5");
	    }

	    @DisplayName("Don't Play DemoClass with number = 0")
	    @Test
	    public void testZero() {

	        Assertions.assertThrows(IllegalArgumentException.class,
	                () -> demoClass.play(0));
	    }

	    @AfterEach
	    public void tearDown() {
	        demoClass = null;
	    }

}
