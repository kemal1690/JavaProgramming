package day48_Collections;

public class ClassNotes {

    /*

    Java Day48
Topic: Collections Intro

package name: day48_Collections


Data Structures: work with data

	Array
	Collection
	Map


Array: size is fixed
		supports both primitives & non-primitives


Collection (I): Size is dynamic
			supports non-primitives ONLY


			List (I): accepts duplicates, has index numbers

					ArrayList (C): internally uses array

									accessing/retriving the element is faster ( get() )

					LinkedList (C): internally uses doubly linked list

									adding/removing is faster ( add()/remove() )

					Vector (C): internally uses array
								is Synchronized ==> Thread-safe

					Stack (C): Is synchronized
							   Last in first out order (LIFO)


			Set (I): does not accept duplicates, does not have index

				HashSet (C): order is random


				LinkedHashSet (C): keeps the insertion order as it is


				TreeSet (C): keeps the sorted order
							 does not accept null



			Queue(I)




Synchronized: multiple threads are being executed one thread at time

			advantage: thread-safe
			disadvantage: slower


process: execution instance of a program


thread: A sequence of execution within process


multi-threading: two or more threads being executed within the process


multi-tasking: two or more process are running






concurrently vs parellely:

		concurrently:  1000 * 5 ===> 5000 seconds ===> 10000 threads

			chromer browser (process)	 ===> 10000 threads


		Parallely: 	200 * 5 = 1000 seconds

			chrome browser1	 (process)  ===> 200
			chrome browser2  (process)	===> 200
			chrome browser3  (process)  ===> 200
			chrome browser4	 (process)  ===> 200
			chrome browser5  (process)  ===> 200







ArrayList vs LinkedList vs Vector vs Stack:

		All of them are Lists (allows duplicates, has index)

		ArrayList: searching elements are faster

		LinkedList: insertion & deletion of elements are faster

		Vector: Same as ArrayList but Synchronized

		Stack: Has Last-in-first-out (LIFO) logic


     */
}
