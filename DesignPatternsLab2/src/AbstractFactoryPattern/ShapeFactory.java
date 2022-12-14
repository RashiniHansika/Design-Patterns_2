package AbstractFactoryPattern;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if (shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if (shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else if (shapeType.equalsIgnoreCase("Triangle"))
			return new Triangle();
		else
			return null;

	}
}
