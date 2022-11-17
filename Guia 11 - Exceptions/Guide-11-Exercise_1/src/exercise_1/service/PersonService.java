package exercise_1.service;

import exercise_1.object.Person;

/**
 *
 * @author Damian
 */
public class PersonService {
    
    Person p1 = new Person(null,0,null,0,0);

    public boolean esMayorDeEdad() throws IllegalArgumentException {
        
        if(p1.getAge()==0){
            throw new IllegalArgumentException("invalid age");
        }
        return p1.getAge()>=21;
    }
    
}
