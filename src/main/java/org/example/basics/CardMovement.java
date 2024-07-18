package org.example.basics;

public class CardMovement {
    public static int[] moveCardOnGrid(String[] instructions, int[] start) {
        int x = start[0];
        int y = start[1];
        for (String direction : instructions) {
            switch (direction) {
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
            }
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String[] instructions = {"up", "up", "left", "down", "right"};
        int[] startPosition = {0, 0};
        int[] result = moveCardOnGrid(instructions, startPosition);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
        // Output: (0, 1)
    }
}
