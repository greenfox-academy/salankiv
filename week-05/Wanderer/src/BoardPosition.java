public class BoardPosition {

	int value;
	int x;
	int y;
	int[][] boardMap = {
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 0, 0, 0, 1, 1, 0, 0}
	};

	public BoardPosition() {
	}

	public int getValue(int x, int y) {
		this.value = boardMap[x][y];
		return value;
	}
}
