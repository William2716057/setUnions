import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
	Set<T> result = new HashSet<>(setA);
	result.addAll(setB);
	return result;

	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>();
		setA.add(1);
		setA.add(2);
		setA.add(3);

		Set<Integer> setB = new HashSet<>();
		setB.add(3);
		setB.add(4);
		setB.add(5);

		Set<Integer> unionSet = union(setA, setB);
		System.out.println("Union of set A and set B: " + unionSet);
	}
}
