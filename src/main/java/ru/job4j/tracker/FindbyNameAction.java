package ru.job4j.tracker;

public class FindbyNameAction implements UserAction {

    @Override
    public String name() {
        return "Find item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("=== Enter item name for search ====>" + System.lineSeparator());
        Item[] rstItem = tracker.findByName(name);
        if (rstItem.length > 0) {
            for (Item item : rstItem) {
                System.out.println(item);
            }
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
