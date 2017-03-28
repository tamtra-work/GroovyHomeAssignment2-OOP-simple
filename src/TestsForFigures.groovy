import spock.lang.*
import java.lang.Math

class TestsForFigures extends Specification {

    @Unroll
    def "Calculating perimeter of square"(){
        when: "There's a square with side length = #x"
        def testSquare = new Square(sideA: x)

        then: "Calculate perimeter"
        testSquare.getPerimeter()== perim

        where: "Providing different values of square side length"
        x || perim
        0 || 0
        0.1 || 0.4
        1 || 4
        2 || 8
        -5 || null
    }

    @Unroll
    def "Calculating area of square"(){
        when:
        def testSquare = new Square(sideA: x)

        then:
        testSquare.getPerimeter()== area

        where:
        x << [0, 0.1, 1, 2, -5]
        area << [0, 0.4, 4, 8, null]
    }

    @Unroll
    def "Calculating perimeter of circle"(){
        when: "There's a circle with radius = #r"
        def testCircle = new Circle(radius: r)

        then: "Calculate perimeter"
        Math.abs(testCircle.getPerimeter()- perim) <= epsilon

        where: "Providing different values of circle radius"
        r || perim
        1 || 6.24
        5 || 31.4

    }

    @Unroll
    def "Calculating area of circle"(){
        when:
        def testCircle = new Circle(radius: r)

        then:
        testCircle.getArea().round(2) == area  // Cannot resolve symbol 'round' -?

        where:
        r << [1, 5]
        area << [3.14, 78.54]
    }

}
