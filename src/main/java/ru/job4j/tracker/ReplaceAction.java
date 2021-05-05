package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

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
            out.println("Ok");
        } else {
            out.println("Error");
        }
        return true;
    }
}