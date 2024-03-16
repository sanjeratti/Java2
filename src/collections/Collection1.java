package collections;

public class Collection1 {
    public static void main (String[] args){

        //                              Iterable
        //                              Collection
        //  List                            Queue                           Set
        //Uporyadochennaya kollektsia dannyh
        //index
        //Dinamicheskiy

        ///List (ArrayList,    LinkedList,   Vector,     Stack (Vector))
        //                      ArrayList                       LinkedList
        //obrashenie po indeksu bistree            |        Nalichie svyazannosti
        // potokobezopasniy                        |        Est ukazatel na predydushiy i sled elementy
        //                                         |        Metody Dinamicheskie (Slojnie i vipolneniyu skorostiyu)
        //                                         |        add() remove()  metody imeyut fiksirovannuyu skorost

        //                          Vectror  (Rabotaet kak Arraylist)
        // sinhronizovanniy   \
        //                           menee proizvoditelniy
        // potokobezopasniy   /     1 potok (kak 1 ruka cheloveka)

        //                      Set (HashSet, TreeSet, LinkedHashSet)
        //  HashSet  ---> v razbros
        //  LinkedHashSet  -->  po mere dobavleniya, po poryadku
        //  TreeSet       -->  sortiruet


        //                      QUEUE
        //  PriorityQueue                           DEQUE  --> ArrayDeque
        //  Vivodit v poryadke dobavlenya   |       FIFO  (perviy zashel perviy vishel)    LIFO  (Posledniy zashel perviy vishel)

       //        pop()                      poll()
       //        NoSuchElementExeption      null
       //        Stack                      Queue
       //       rabotatet s LIFO            rabotatet s FIFO
    }
}
