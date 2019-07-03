package com.hy.shengcheng;

public class ArraySort {
	// 求和
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 平均值
	public int avg(int[] arr) {
		return sum(arr) / arr.length;
	}

	// 最大值
	public int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 最小值
	public int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// 查找数组中的某个元素
	public boolean search(int[] arr, int j) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == j) {
				return true;
			}
		}
		return false;
	}

	// 遍历数组
	public void printArray(int[] arr) {
		System.out.print("result:[");
		for (int arr1 : arr) {
			System.out.print(arr1 + "  ");
		}
		System.out.println("]");
	}

	// 数组反转
	public void invert(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			swap(arr, arr[i], arr[arr.length - i]);
		}
	}

	// 数组复制
	public int[] copyOfArray(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// 冒泡排序
	public void paoSort(int[] arr, String str) {
		if (str == "asc") {// 从小到大
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						swap(arr, j, j + 1);
					}
				}
			}
		} else if (str == "desc") {// 从大到小
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						swap(arr, j, j + 1);// 交换元素
					}
				}
			}
		} else {
			System.out.println("输入有误");
		}
		// return arr;
	}

	// 交换元素
	public void swap(int[] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// 直接排序
	public void dricSort(int[] arr, String str) {
		if (str == "asc") {// 从小到大
			for (int i = 0; i < arr.length - 1; i++) {
				int index = 0;
				for (int j = 1; j <= arr.length - i - 1; j++) {
					if (arr[j] > arr[index]) {
						index = j;
					}
				}
				swap(arr, index, arr.length - i - 1);
			}
		} else if (str == "desc") {// 从大到小
			for (int i = 0; i < arr.length - 1; i++) {
				int index = 0;
				for (int j = 1; j <= arr.length - i - 1; j++) {
					if (arr[j] < arr[index]) {
						index = j;
					}
				}
				swap(arr, index, arr.length - i - 1);
			}
		} else {
			System.out.println("输入有误");
		}
		// return arr;
	}

}
