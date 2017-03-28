import java.lang.Math

class Circle extends Figure{
    def radius

    def getArea(){
        return Math.PI*radius**2
    }

    def getPerimeter(){
        return 2*Math.PI*radius
    }
}
