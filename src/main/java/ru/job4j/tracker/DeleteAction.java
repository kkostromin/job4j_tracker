package ru.job4j.tracker;

public class DeleteAction implements UserAction{

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int ids = input.askInt("=== Enter id's item for delete ====>" + System.lineSeparator());
        if (tracker.delete(ids)) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
