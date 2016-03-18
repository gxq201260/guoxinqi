package triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class triangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsTriangle() {
		Triangle tg1 = new Triangle(1,2,4);
		assertEquals((String)"不是三角形",tg1.isTriangle());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"是三角形",tg2.isTriangle());
	}

	@Test
	public void testIsEquilateral() {
		Triangle tg1 = new Triangle(1,2,4);
		assertEquals((String)"不是三角形",tg1.isEquilateral());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"不是等边三角形",tg2.isEquilateral());
		Triangle tg3 = new Triangle(3,3,3);
		assertEquals((String)"是等边三角形",tg3.isEquilateral());
	}

	@Test
	public void testIsIsosceles() {
		Triangle tg1 = new Triangle(2,2,4);
		assertEquals((String)"不是三角形",tg1.isIsosceles());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"不是等腰三角形",tg2.isIsosceles());
		Triangle tg3 = new Triangle(3,3,4);
		assertEquals((String)"是等腰三角形",tg3.isIsosceles());
	}

}
