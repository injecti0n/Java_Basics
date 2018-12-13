package com.demoTime.collections.sortingWarehouse.interfaces;

import com.demoTime.collections.sortingWarehouse.Box;

import java.util.Comparator;

/**
 * Created by Mrrobot on 28/05/2018 javabasics-workspace.
 */
public class IdChecker implements Comparator<Box> {

    @Override
    public int compare (Box o1, Box o2) {
        return o1.getId()- o2.getId();
    }
}
