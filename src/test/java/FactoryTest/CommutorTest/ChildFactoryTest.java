package FactoryTest.CommutorTest;


import org.junit.Test;
import za.ac.cput.Domain.Commutors.Child;
import za.ac.cput.Factory.Commutor.ChildFactory;

import static org.junit.Assert.assertEquals;

public class ChildFactoryTest {

    @Test
    public void getChild()
    {
        int age = 13;

        Child aChild = ChildFactory.getChild(age);

        assertEquals(aChild.getAge(),13);
    }
}