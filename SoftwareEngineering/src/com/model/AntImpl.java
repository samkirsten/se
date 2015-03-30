package com.model;

/**
 * Created by Tina on 3/23/2015.
 */
public class AntImpl implements Ant {

    public int ID ;
    public Colour colour ;
    public  int state ;
    public int resting ;
    public int direction;
    public boolean hasFood;
    public Position position;


    public AntImpl(int ID, Colour colour, Position position){
        this.ID = ID ;
        this. colour = colour ;
        this.position = position ;

        direction = 0 ;
        resting =0;
        state = 0;
        hasFood = false ;
    }

    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position = position ;
    }

    /***
     * this method returns the ID of the ant
     * @return int, the ID of the ant
     */
    //1-49 black, other is red
    public int getID() {
        return ID;
    }

    /***
     * set the ID of the ant
     * @param id int
     */

    public void setID(int id) {
        ID = id ;
    }

    /**
     * Gets the current direction that the ant is facing
     *
     * @return int representing current direction between 0 and 5 (inclusive)
     */

    public int getDirection() {
        return direction;
    }

    /**
     * Sets the direction that the ant is facing
     *
     * @param direction The direction to set the ant as facing towards, between 0 and 5 (inclusive)
     */

    public void setDirection(int direction) {
        if (direction>=0 && direction<6){
            this.direction = direction ;

        }
    }

    /**
     * Gets the current brain state that the ant is in, used by the com.model.Brain to compute the ant's next move
     *
     * @return int representing the current brain state
     */

    public int getState() {
        return state ;
    }
    /**
     * Set the current brain state of the ant, invoked by the brain in order to update the ant's
     * behaviour for the next turn
     *
     * @param state an int representing the current state of the brain
     */

    public void setState(int state) {
        if (state <= 9999 && state >=0){
            this.state = state ;
        }

    }

    public void setColour(Colour colour) {
        this.colour = colour ;
    }


    public Colour getColour()
    {
        return colour ;
    }



    /**
     * Returns whether the ant is resting. After an ant performs an action, it rests for 14 turns.
     *
     * @return true if ant is resting, false otherwise (if 0)
     */

    public boolean isResting() {
        return (resting != 0);
    }

    /**
     * Sets rest to 1. Which begins the rest period which lasts 14 turns.
     */
    public void startResting() {
        resting = 1 ;
    }

    /**
     * Returns the amount of rest that the ant still requires before its next move. An ant rests for 14 turns
     *
     * @return int representing number of turns that the ant still must rest for before its next movement
     */

    public int getRemainingRest() {
        return (15-resting) ;
    }

    /**
     * Increments the ant's rest counter by 1. The counter ranges from 0-14, looping back after it has reached it's max
     * range. An ant can only perform a movement on turn 0.
     */

    public void incrementRest() {
        if (resting < 15){
            resting ++;
        }
        if (resting == 15){
            resting = 0;
        }

    }



    /**
     * Returns whether the ant is currently carrying food
     *
     * @return true if carrying food, false otherwise.
     */

    public boolean hasFood() {
        return hasFood;
    }


    public void setHasFood(Boolean food) {
        hasFood = food ;
    }

    //    /**
//     * Marks a scent at a cell when given a position and scent marker
//     *
//     * @param pos    the position of the cell
//     * @param marker the scent marker
//     */
//
//    public void markScent(com.model.Position pos, int marker) {
//        //***** try in MAP class ? *****
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AntImpl ant = (AntImpl) o;

        if (ID != ant.ID) return false;
        if (direction != ant.direction) return false;
        if (hasFood != ant.hasFood) return false;
        if (resting != ant.resting) return false;
        if (state != ant.state) return false;
        if (colour != ant.colour) return false;
        if (position != null ? !position.equals(ant.position) : ant.position != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + state;
        result = 31 * result + resting;
        result = 31 * result + direction;
        result = 31 * result + (hasFood ? 1 : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}






