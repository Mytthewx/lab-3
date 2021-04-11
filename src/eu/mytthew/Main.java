package eu.mytthew;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// EX1
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Number: " + i);
//        }

		// EX2
//        for (int i = 100; i >= 1 ; i--) {
//            System.out.println("Number: " + i);
//        }

		// EX3
//        System.out.println("Give multiplier: ");
//        int multiplier = scanner.nextInt();
//        System.out.println("Give amount of elements: ");
//        int amountOfElements = scanner.nextInt();
//        multiplier(multiplier, amountOfElements);

		// EX4
//        System.out.println("Give upper range: ");
//        int upperRange = scanner.nextInt();
//        System.out.println("Give lower range: ");
//        int lowerRange = scanner.nextInt();
//        displayRange(lowerRange, upperRange);

		// EX5
//		System.out.println("Give upper range: ");
//		int upperRange = scanner.nextInt();
//		System.out.println("Give lower range: ");
//		int lowerRange = scanner.nextInt();
//		displayRange(lowerRange, upperRange);
//		System.out.println("Enter the divisor: ");
//		int divisor = scanner.nextInt();
//		displayDivisibleNumbers(lowerRange, upperRange, divisor);

        // EX6
//        System.out.println("Enter some string: ");
//        String sampleSentence = scanner.nextLine();
//        System.out.println("Give sign to check: ");
//        char signToCheck = scanner.next().charAt(0);
//        int counter = occurCounter(sampleSentence, signToCheck);
//        System.out.println("Requested char occurs " + counter + " times in text.");

		// EX7
//        System.out.println("Enter some string: ");
//        String sampleSentence = scanner.nextLine();
//        System.out.println("Give sign to check: ");
//        char signToCheck = scanner.next().charAt(0);
//        System.out.println(occurCounterWithPositions(sampleSentence, signToCheck));

		// EX8
//		System.out.println("How much elements of Fibonacci string?");
//		int n = scanner.nextInt();
//		fibonacci(n);

		// EX9
//		System.out.println("Enter sign: ");
//		char sign = scanner.next().charAt(0);
//		System.out.println("Give x wall: ");
//		int x = scanner.nextInt();
//		System.out.println("Give y wall: ");
//		int y = scanner.nextInt();
//		rectangle(sign, x, y);

		// EX10
//		multiplicationTable();

		// EX11
//		System.out.println("Enter sign to display: ");
//		char sign = scanner.next().charAt(0);
//		System.out.println("Enter number of layers: ");
//		int layers = scanner.nextInt();
//		treeDrawing(layers, sign);

		// EX12
//		System.out.println("Enter sign to display: ");
//		char sign = scanner.next().charAt(0);
//		System.out.println("Enter number of layers: ");
//		int layers = scanner.nextInt();
//		mirrorTreeDrawing(layers, sign);

		// EX13
//		System.out.println("Enter num of layers in numbers tree");
//		int treeLayer = scanner.nextInt();
//		numberTree(treeLayer);

		// EX14
//		System.out.println("Enter sign to display: ");
//		char sign = scanner.next().charAt(0);
//		System.out.println("Enter number of layers: ");
//		int layers = scanner.nextInt();
//		columns(layers, sign);

		// EX 15
//		System.out.println("Enter sign to display: ");
//		char sign = scanner.next().charAt(0);
//		System.out.println("Enter number of layers: ");
//		int layers = scanner.nextInt();
//		frame(layers, sign);
	}

	private static void multiplier(int multiplier, int amountOfElements) {
		int result = 0;
		for (int i = 0; i <= amountOfElements; i++) {
			System.out.print(result + " ");
			result += multiplier;
		}
	}

	private static void displayRange(int lowerRange, int upperRange) {
		for (int i = lowerRange; i <= upperRange; i++) {
			if (i % 2 == 0) {
				System.out.println("Number " + i + " is even.");
			} else {
				System.out.println("Number " + i + " is odd.");
			}
		}
	}

	private static void displayDivisibleNumbers(int lowerRange, int upperRange, int divisor) {
		System.out.println("Those numbers are divisible by " + divisor + ": ");
		for (int i = lowerRange; i <= upperRange; i++) {
			if (i % divisor == 0) {
				System.out.println(i);
			}
		}
	}

    private static int occurCounter(@NotNull String text, char sign) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == sign) {
                count++;
            }
        }
        return count;
    }

    private static String occurCounterWithPositions(@NotNull String text, char sign){
	    List<Integer> indexes = new ArrayList<>();
	    int count = 0;
	    for (int i = 0; i < text.length(); i++) {
		    if (text.charAt(i) == sign) {
			    count++;
			    indexes.add(i);
		    }
	    }
	    return "'" + sign + "'" + " occur " + count + " times on indexes: " + indexes + " in "
			    + "'" + text + "'";
    }

	private static void fibonacci(int n) {
		if (n == 0) {
			System.out.println("Cannot be zero elements!");
		} else if (n == 1) {
			System.out.println("Elements: 0");
		} else if (n >= 2) {
			int prev = 0;
			int act = 1;
			int result = 1;
			System.out.print("Elements: 0, ");
			for (int i = 0; i <= n - 2; i++) {
				System.out.print(result + ", ");
				result = prev + act;
				prev = act;
				act = result;
			}
		}
	}

	private static void rectangle(char sign, int x, int y) {
		for (int i = 0; i < x; i++) {
			System.out.print(sign);
		}
		System.out.println();
		for (int i = 0; i < y - 2; i++) {
			System.out.print(sign);
			for (int j = 0; j < x - 2; j++) {
				System.out.print(' ');
			}
			System.out.print(sign + "\n");
		}
		for (int i = 0; i < x; i++) {
			System.out.print(sign);
		}
	}

	private static void multiplicationTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int act = i * j;
				String num = Integer.toString(act);
				if (num.length() == 1) {
					System.out.print("  " + act + " ");
				} else if (num.length() == 2) {
					System.out.print(" " + act + " ");
				} else {
					System.out.println(act);
				}
			}
			System.out.println();
		}
	}

	private static void treeDrawing(int layers, char sign) {
		for (int i = 1; i <= layers; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}

	private static void mirrorTreeDrawing(int layers, char sign) {
		for (int i = 1; i <= layers; i++) {
			for (int k = 0; k < layers - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}

	private static void numberTree(int treeLayer) {
		for (int i = 1; i <= treeLayer; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

	private static void columns(int layers, char sign) {
		for (int i = 0; i < layers; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(sign);
			}
			for (int j = 0; j < layers - 4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}

	private static void frame(int layers, char sign) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < layers; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
		columns(layers, sign);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < layers; j++) {
				System.out.print(sign);
			}
			System.out.println();
		}
	}
}
