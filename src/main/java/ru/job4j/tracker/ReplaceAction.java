package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int ids = input.askInt("=== Enter id's item ====>" + System.lineSeparator());
        String name = input.askStr("=== Enter new item name ====>" + System.lineSeparator());
        Item itemNew = new Item(name);
        if (tracker.replace(ids, itemNew)) {
            System.out.println("Ok");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
