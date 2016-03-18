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
		assertEquals((String)"����������",tg1.isTriangle());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"��������",tg2.isTriangle());
	}

	@Test
	public void testIsEquilateral() {
		Triangle tg1 = new Triangle(1,2,4);
		assertEquals((String)"����������",tg1.isEquilateral());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"���ǵȱ�������",tg2.isEquilateral());
		Triangle tg3 = new Triangle(3,3,3);
		assertEquals((String)"�ǵȱ�������",tg3.isEquilateral());
	}

	@Test
	public void testIsIsosceles() {
		Triangle tg1 = new Triangle(2,2,4);
		assertEquals((String)"����������",tg1.isIsosceles());
		Triangle tg2 =new Triangle(3,4,5);
		assertEquals((String)"���ǵ���������",tg2.isIsosceles());
		Triangle tg3 = new Triangle(3,3,4);
		assertEquals((String)"�ǵ���������",tg3.isIsosceles());
	}

}
