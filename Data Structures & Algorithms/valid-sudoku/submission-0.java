class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> colMap = new HashMap<>();
        HashMap<String, HashSet<Integer>> boxMap = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') continue;

                int numb = Character.getNumericValue(board[row][col]);
                String boxKey = (row / 3) + "," + (col / 3);

                rowMap.putIfAbsent(row, new HashSet<>());
                colMap.putIfAbsent(col, new HashSet<>());
                boxMap.putIfAbsent(boxKey, new HashSet<>());

                if(colMap.get(col).contains(numb) || rowMap.get(row).contains(numb)
                        || boxMap.get(boxKey).contains(numb)) return false;

                rowMap.get(row).add(numb);
                colMap.get(col).add(numb);
                boxMap.get(boxKey).add(numb);
            }

        }
        return true;
    }
}
