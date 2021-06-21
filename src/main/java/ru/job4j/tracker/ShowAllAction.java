package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show All Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== All items ====>" );
        Item[] itemRsl = tracker.findAll();
        for(Item item : itemRsl){
            out.println(item);
        }
        return false;
    }
}
