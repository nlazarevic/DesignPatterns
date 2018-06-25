package iterator.aggregate;

import iterator.IteratorInterface;

import java.util.LinkedList;

public class SubjectListIterator implements IteratorInterface {
    private LinkedList<String> subjects;
    private int position;

    public SubjectListIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }
}
