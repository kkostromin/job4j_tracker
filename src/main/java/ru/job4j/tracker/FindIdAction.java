package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int ids = input.askInt("=== Enter id's item for search ====>" + System.lineSeparator());
        Item rstItem = tracker.findById(ids);
        if (rstItem != null) {
            out.println("Result : " + "Id name - "+ rstItem.getName());
        } else {
            out.println("Item not found");
        }
        return true;
    }
}
