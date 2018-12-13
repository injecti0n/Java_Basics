package be.intecbrussel.alexander_oplossingen.theorie_fundamentels.codevoorbeelden.first_1;

/**
 * Created by Mrrobot on 4/06/2018 javabasics-workspace.
 */
public class Beetle extends Insect {

    @Override
    int getNumberOfLegs () {
        return 6;
    }

    /*
    This is not included in original code
    and that's what breaks it!!!
     */
    @Override
    public int getNumberOfSections () {
        return 0;
    }
}
