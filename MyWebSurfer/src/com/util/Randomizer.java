package com.util;

import java.util.Random;

public class Randomizer {

	/**
	 * Desc:Generates a random number from 0-maxValue.
	 * 
	 * @param maxValue
	 *            Maximum value generated,starting for 0 to max.
	 * @return integer.
	 */
	public static int getRandom(int maxValue) {
		return new Random().nextInt(maxValue);
	}

	/**
	 * Desc:Generates 2D array with random values.
	 * 
	 * @param maxValue
	 *            value.
	 * @param dimSize
	 *            array dimensions size.
	 * @return array of integer[][]
	 */
	public static int[][] getRandomArray2D(int row, int column) {
		int[][] localArray = new int[row][column];

		return localArray;
	}

}
