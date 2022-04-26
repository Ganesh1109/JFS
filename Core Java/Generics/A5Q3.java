class Generics<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class A5Q3 {

	public static void main(String[] args) {
		Integer arr[] = {22,26,65,32,84};
		Generics<Integer> objGeneric = new Generics<>();
		Integer[] arr1=objGeneric.swap(arr, 0, 3);
		for(int i : arr1) {
			System.out.println(i);
		}

	}

}