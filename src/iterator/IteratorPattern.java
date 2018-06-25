package iterator;

import iterator.aggregate.SubjectArray;
import iterator.aggregate.SubjectInterface;
import iterator.aggregate.SubjectList;

public class IteratorPattern {
    public static void main(String[] args){
        System.out.println("---ITERATOR PATTERN---");
        SubjectInterface subjectArray = new SubjectArray();
        SubjectInterface subjectList = new SubjectList();

        IteratorInterface subjectArrayIterator = subjectArray.createIterator();
        IteratorInterface subjectListIterator = subjectList.createIterator();

        System.out.println("Subjects in the array:");
        print(subjectArrayIterator);

        System.out.println("Subjects in the list:");
        print(subjectListIterator);

        System.out.println("---END OF ITERATOR PATTERN---");
    }

    public static void print(IteratorInterface iterator){
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
