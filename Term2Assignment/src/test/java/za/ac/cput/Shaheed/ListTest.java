package za.ac.cput.Shaheed;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.ArrayList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ListTest {


    @Test
    @Order(1)
    void Add(){
        ArrayList<List> taskList = new ArrayList<>();
        System.out.println("No Tasks");
        System.out.println("adding...");
        List list = new List("Do Laundry", 0);
        taskList.add(list);
        System.out.println(taskList);
        System.out.println("adding...");
        List list1 = new List("Get Food", 1);
        taskList.add(list1);
        System.out.println(taskList);
    }

    @Test
    @Order(2)
    void Remove(){
        ArrayList<List> taskList = new ArrayList<>();
        List list = new List("Do Laundry", 0);
        taskList.add(list);
        List list1 = new List("Get Food", 1);
        taskList.add(list1);
        System.out.println(taskList);
        System.out.println("removing 1st Task...");
        taskList.remove(0);
        System.out.println(taskList);

    }

    @Test
    @Order(3)
    void Find(){
        ArrayList<List> taskList = new ArrayList<>();
        List list = new List("Do Laundry", 0);
        taskList.add(list);
        List list1 = new List("Get Food", 1);
        taskList.add(list1);
        System.out.println(taskList);
        System.out.println(taskList.get(1));
    }

}