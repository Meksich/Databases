package ua.lviv.iot.view;

import ua.lviv.iot.controller.AbstractControllerImpl;
import ua.lviv.iot.controller.implementation.*;
import ua.lviv.iot.model.entity.*;

import java.util.Scanner;

public class View {
    private static Scanner input = new Scanner(System.in);
    public static void view(){
        choose_table:
        while (true){
            Class entity;
            AbstractControllerImpl controller;
            ViewOperations viewOperations;

            System.out.println("Choose your table:");
            System.out.println("1: Bus");
            System.out.println("2: Bus producer");
            System.out.println("3: Bus rented");
            System.out.println("4: Driver");
            System.out.println("5: Route");
            System.out.println("6: Security");
            System.out.println("7: Stop");
            System.out.println("8: Ticket");
            System.out.println("E: Exit program");
            String table = input.nextLine();

            switch (table){
                case "1":
                    entity = Bus.class;
                    controller = new BusControllerImpl();
                    break;
                case "2":
                    entity = BusProducer.class;
                    controller = new BusProducerControllerImpl();
                    break;
                case "3":
                    entity = BusRented.class;
                    controller = new BusRentedControllerImpl();
                    break;
                case "4":
                    entity = Driver.class;
                    controller = new DriverControllerImpl();
                    break;
                case "5":
                    entity = Route.class;
                    controller = new RouteControllerImpl();
                    break;
                case "6":
                    entity = Security.class;
                    controller = new SecurityControllerImpl();
                    break;
                case "7":
                    entity = Stop.class;
                    controller = new StopControllerImpl();
                    break;
                case "8":
                    entity = Ticket.class;
                    controller = new TicketControllerImpl();
                    break;
                case "E":
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                    break choose_table;
                default:
                    System.out.println("Invalid key:" + table);
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                    continue;
            }
            viewOperations = new ViewOperations(entity, controller);
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            boolean shallWeContinue = true;
            while (shallWeContinue) {
                System.out.println("Choose your next action with" + entity.getSimpleName() + "table:");
                System.out.println("1: Create new row");
                System.out.println("2: Update row");
                System.out.println("3: Delete row");
                System.out.println("4: Get row");
                System.out.println("5: Get all rows");
                System.out.println("E: Exit");
                String action = input.nextLine();

                switch (action) {
                    case "1":
                        viewOperations.create();
                        break;
                    case "2":
                        viewOperations.update();
                        break;
                    case "3":
                        viewOperations.delete();
                        break;
                    case "4":
                        viewOperations.get();
                        break;
                    case "5":
                        viewOperations.getAll();
                        break;
                    case "e":
                        shallWeContinue = false;
                        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                        break;
                    default:
                        System.out.println("Invalid key:" + table);
                        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
                }
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
            }
        }
    }
}
