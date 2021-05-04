package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    private final Output out;

    public DeleteAction(Output out) {
        this.out =out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int ids = input.askInt("=== Enter id's item for delete ====>" + System.lineSeparator());
        if (tracker.delete(ids)) {
            out.println("Ok");
        } else {
            out.println("Error");
        }
        return true;
    }
}
