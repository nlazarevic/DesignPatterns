package iterator.aggregate;

import iterator.IteratorInterface;

public class SubjectArray implements SubjectInterface {
    private String[] subjects;

    public SubjectArray() {
        subjects = new String[2];
        subjects[0] = "Array 0";
        subjects[1] = "Array 1";
    }

    @Override
    public IteratorInterface createIterator() {
        return new SubjectArrayIterator(subjects);
    }
}
