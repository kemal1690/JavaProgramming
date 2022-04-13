package day40_FinalKeyWord;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;


    public Circle getCircle(){

        return circle;
    }

    public Square getSquare(){

        return square;
    }


    public void setCircle(Circle circle){//data type of the parameter has to match with private variable data type

        if(circle.getRadius() < 5){

            return;
        }
        this.circle = circle;//we are calling the instance variable
    }

    public void setSquare(Square square){

        if(square.getSide()<0){
            return;
        }

        this.square = square;
    }







}
