package tictactoe;

/**
 *
 * @author Yingge Hu
 * The class stores information about challenger who play tic tac toe
 */
public class Challenger {
    private String firstName, lastName, gender;
    private int age, score;
    
    /**
     * Constructor stores variables
     */
    public Challenger(String firstName, String lastName, String gender, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setAge(age);
        this.score = 0;
    }

    /**
     * get first name of the challenger
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set first name of the challenger, input should be letters with uppercase start
     */
    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-z]*"))
            this.firstName = firstName;
        else{
            throw new IllegalArgumentException("first name should start with uppercase, all characters should be letters");
        }
    }

    /**
     * get last name of the challenger
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set last name of the challenger, input should be letters with uppercase start
     */
    public void setLastName(String lastName) {
        if (lastName.matches("[A-Z][a-z]*"))
            this.lastName = lastName;
        else{
            throw new IllegalArgumentException("last name should start with uppercase, all characters should be letters");
        }
    }

    /**
     * get gender of the challenger
     */
    public String getGender() {
        return gender;
    }

    /**
     * set gender of the challenger, input should be male of female
     */
    public void setGender(String gender) {
        if(gender.equals("female") || gender.equals("male")){
            this.gender = gender;
        }
        else{
            throw new IllegalArgumentException("gender should be male or female");
        }
    }

    /**
     * get age of the challenger
     */
    public int getAge() {
        return age;
    }

    /**
     * set age of the challenger, input should between 0 to 90
     */
    public void setAge(int age) {
        if(age >= 0 && age <= 90){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("age range should between 0 to 90");
        }
    }

    /**
     * get score of the challenger
     */
    public int getScore() {
        return score;
    }

    /**
     * update score of the challenger, input should be win, lose or draw
     */
    public void updateScore(String result) {
        if(result.equals("win")){
            score += 1;
        }
        else if(result.equals("lose")){
            score -= 1;
        }
        else if(result.equals("draw")){
            score = score;
        }
        else{
            throw new IllegalArgumentException("result should be win, lose or draw");
        }
    }   
}
