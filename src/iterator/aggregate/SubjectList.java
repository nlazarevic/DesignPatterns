package iterator.aggregate;

import iterator.IteratorInterface;

import java.util.LinkedList;

public class SubjectList implements SubjectInterface{

    private LinkedList<String> subjects;

    public SubjectList() {
        subjects = new LinkedList<>();
        subjects.addLast("Subject list 0");
        subjects.addLast("Subject list 1");
        subjects.addLast("Subject list 2");
    }

    @Override
    public IteratorInterface createIterator() {
        return new SubjectListIterator(subjects);
    }
}
