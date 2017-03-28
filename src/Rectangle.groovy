class Rectangle extends Figure{
    def sideA, sideB

    def getArea(){
        return sideA*sideB
    }

    def getPerimeter(){
        return 2*(sideA + sideB)
    }
}
