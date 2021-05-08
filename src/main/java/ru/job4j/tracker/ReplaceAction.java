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
        boolean run = true;
        int ids = -1;
        while(run){
            ids = input.askInt("=== Enter id's item ====>" + System.lineSeparator());
            if (tracker.findById(ids) == null){
                out.println("Wrong input, you need enter valid id item");
                continue;
            }
            else run = false;
        }
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
