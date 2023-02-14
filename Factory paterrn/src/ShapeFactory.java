public class ShapeFactory {
    public Circle getShape(){
        return new Circle();
    }
    public Shape getShape(int shapeCode){
        switch (shapeCode){
            case 0:
                return new Square();
            default:
                return new Circle();
        }
//        if(shapeCode == 0)
//            return new Square();
//        else
//            return new Circle();
    }
}
