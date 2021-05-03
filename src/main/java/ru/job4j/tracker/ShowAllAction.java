package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    @Override
    public String name() {
        return "Show All Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All items ====>" + System.lineSeparator());
        Item[] itemRsl = tracker.findAll();
        for(Item item : itemRsl){
            System.out.println(item);
        }
        return true;
    }
}
