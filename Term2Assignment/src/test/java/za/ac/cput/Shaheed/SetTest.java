package za.ac.cput.Shaheed;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {

    @Test
    @Order(1)
    void Add(){
        Set<String> set = new HashSet<String>();
        System.out.println("No Tasks");
        System.out.println("adding...");
        set.add("Do Laundry");
        System.out.println(set);
        System.out.println("adding...");
        set.add("Clean Dishes");
        System.out.println(set);
    }

    @Test
    @Order(2)
    void Remove(){
        Set<String> set = new HashSet<String>();
        set.add("Do Laundry");
        set.add("Clean Dishes");
        System.out.println("Initial HashSet " +  set);
        System.out.println("Removing laundry task");
        set.remove("Do Laundry");
        System.out.println("New HashSet " + set);


    }

    @Test
    @Order(3)
    void Find(){
        Set<String> set = new HashSet<String>();
        set.add("Do Laundry");
        set.add("Clean Dishes");
        System.out.println("Initial HashSet " +  set);
        String check = "Get Food";
        System.out.println("Contains " + check + " " + set.contains(check));
    }

}