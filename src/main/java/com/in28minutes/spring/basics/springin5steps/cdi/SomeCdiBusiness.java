package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 5:10 PM
 */
@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCDIDAO() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDao.getData();

        for (int value :
                data) {
            if (value > greatest) greatest = value;
        }
        return greatest;
    }
}
