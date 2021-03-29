package algorithm;

public class BinarySearchIterativeAndRecursive {

	static int count = 0;

	static int BinarySearchIterative(int a[], int x) {
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return -1;
	}

	static int BinarySearchRecursive(int a[], int l, int h, int x) {
		if (l == h) {// jodi array te sudhu akta matro element thake tobe
			count++;
			if (a[l] == x) {
				return l;
			} else {
				return -1;
			}
		} else {
			int mid = (l + h) / 2;
			if (a[mid] == x) {
				count++;
				return mid;
			} else if (a[mid] < x) {                                 //l=mid+1;
				count++;
				return BinarySearchRecursive(a, mid + 1, h, x);
			} else {                                                        //h=mid-1;
				count++;
				return BinarySearchRecursive(a, l, mid - 1, x);
			}
		}
		//	return -1;
	}

	public static void main(String[] args) {
		int a[] = {-15, -6, 0, 7, 9, 23, 54, 82, 101, 112, 125, 131, 142, 151};
		int x = 8;
		int l = 0;
		int h = a.length - 1;
		System.out.println(BinarySearchIterative(a, x));
		System.out.println("x is found in index:" + BinarySearchRecursive(a, l, h, x));
		System.out.println("Numver of comparison="+count);
	}
}
