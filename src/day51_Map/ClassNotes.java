package day51_Map;

public class ClassNotes {
    /*
    Java Day51
Topic: Map
	   Enum

Package name: day51_Map


Map (I): pari of collection
		 does not support primitives
		 size is dynamic
		 key MUST be unique, value can be duplicated

		HashMap (C): both key and value can be null
					Maintains the random order

		LinkedHashMap (C): both key and value can be null
						maintains the insertion order

		TreeMap (C): key can not be null, but value can be null
					Maintains the sorted order

		Hashtable (C): both key and value can NOT be null
						Maintains the random order
						synchronized


Methods of Map:
		put(key, value): inserts the given key and value to map

		get(key): returns the value of the given key

		replace(key, newValue): replaces the value of the given key with the given new value

		remove(key): removes the given key and its value from the map

		containsKey(key): returns true if the given key is conatined in the map, otherwise returns false

		containsValue(Value): returns true if the given value is conatined in the map, otherwise returns false

		isEmpty(): returns true if the size of the map is 0, otherwise returns false

		equals(Map): returns true if the given Map is equal with the current map, otherwise returns false

		clear(): removes all the pairs from the map

		---------------------------

		keySet(): returns all the keys of the map, returnType is Set

		values(): returns all the values of the map, returnType is Collection

		entrySet(): returns all the entries (Entry: key & value) of map

				getkey()
				getValue()
				setValue()



Enum: a number of things
     */
}
