import java.util.*;
public class PosListApplication {
    public static void main(String[] args) {
        PositionalList<Integer> list = new LinkedPositionalList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add element to the front");
            System.out.println("2. Add element to the back");
            System.out.println("3. Add element before a position");
            System.out.println("4. Add element after a position");
            System.out.println("5. Set element at a position");
            System.out.println("6. Remove element at a position");
            System.out.println("7. Print elements in the list");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add to the front: ");
                    int elementToAddFront = scanner.nextInt();
                    list.addFirst(elementToAddFront);
                    break;

                case 2:
                    System.out.print("Enter the element to add to the back: ");
                    int elementToAddBack = scanner.nextInt();
                    list.addLast(elementToAddBack);
                    break;

                case 3:
                    System.out.print("Enter the position before which to add: ");
                    Position<Integer> positionBefore = list.first();
                    // You can add logic to select a position here
                    System.out.print("Enter the element to add before: ");
                    int elementToAddBefore = scanner.nextInt();
                    list.addBefore(positionBefore, elementToAddBefore);
                    break;

                case 4:
                    System.out.print("Enter the position after which to add: ");
                    Position<Integer> positionAfter = list.first();
                    // You can add logic to select a position here
                    System.out.print("Enter the element to add after: ");
                    int elementToAddAfter = scanner.nextInt();
                    list.addAfter(positionAfter, elementToAddAfter);
                    break;

                case 5:
                    System.out.print("Enter the position to set: ");
                    Position<Integer> positionToSet = list.first();
                    // You can add logic to select a position here
                    System.out.print("Enter the element to set: ");
                    int elementToSet = scanner.nextInt();
                    list.set(positionToSet, elementToSet);
                    break;

                case 6:
                    System.out.print("Enter the position to remove: ");
                    Position<Integer> positionToRemove = list.first();
                    // You can add logic to select a position here
                    list.remove(positionToRemove);
                    break;

                case 7:
                    if(list.isEmpty()){
                        System.out.println("List is Empty");
                    }
                    else {
                        System.out.println("Elements in the list:");
                        Iterator<Integer> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            Integer element = iterator.next();
                            System.out.println(element);
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

