package ru.job4j.tracker;

public class FindbyNameAction implements UserAction {
    private final Output out;

    public FindbyNameAction(Output out) {
        this.out = out;
    }
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
                out.println(item);
            }
        } else {
            out.println("Item not found");
        }
        return false;
    }
}
