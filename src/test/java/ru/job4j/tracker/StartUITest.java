package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        CreateAction createAction = new CreateAction();
        createAction.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        /*        1. Создаем объект tracker.
        2. Создаем объект item.
        3. Добавляем item в tracker. После этой операции у нас есть id.
        4. Достаем item.id и создаем массив с ответами пользователя.
        5. Вызываем тестируемый метод replaceItem. Это действие изменит состояние объекта tracker.
        6. Ищем по item.id замененный item в объекте tracker.
        7. Сравниваем имя найденной заявки с ожидаемой.*/
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "replaced item"
        };
        ReplaceAction replaceAction = new ReplaceAction();
        replaceAction.execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(),is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        DeleteAction deleteAction = new DeleteAction();
        deleteAction.execute(new StubInput(answers),tracker);
        assertThat(tracker.findById(item.getId()),is(nullValue()));
    }
}