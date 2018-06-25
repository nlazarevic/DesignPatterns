package iterator.aggregate;

import iterator.IteratorInterface;

public class SubjectArrayIterator implements IteratorInterface {
    private String[] subjects;
    private int position;

    public SubjectArrayIterator(String[] subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}
