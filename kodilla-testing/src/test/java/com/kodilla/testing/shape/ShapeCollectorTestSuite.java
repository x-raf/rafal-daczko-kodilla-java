package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle triangle = new Triangle(10,5);
        //When
        shape.addFigure(triangle);
        //Then
        Shape retrievedFigure = shape.getFigure(0);
        //Assert.assertNotNull(retrievedFigure);
        Assert.assertEquals(triangle,retrievedFigure);
        shape.showFigures();
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square(10);
        shape.addFigure(square);

        //When
        boolean result = shape.removeFigure(square);
        //Then
        Assert.assertEquals(0,shape.getShapesCount());
        Assert.assertTrue(result);
        shape.showFigures();
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle(15);
        shape.addFigure(circle);

        //When
        Shape result = shape.getFigure(0);

        //Then
        Assert.assertEquals("circle", result.getShapeName());
        shape.showFigures();
    }
}
