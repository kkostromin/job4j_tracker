package ru.job4j.tracker;

public class FindIdAction implements UserAction {

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int ids = input.askInt("=== Enter id's item for search ====>" + System.lineSeparator());
        Item rstItem = tracker.findById(ids);
        if (rstItem != null) {
            System.out.println("Result : " + "Id name - "+ rstItem.getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
