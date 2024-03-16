public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        depthFirstSearch(image, sr, sc, image[sr][sc], color);
        return image;
    }
    public void depthFirstSearch(int image[][], int sr, int sc, int originalColor, int newColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = newColor;
        depthFirstSearch(image, sr-1, sc, originalColor, newColor);
        depthFirstSearch(image, sr+1, sc, originalColor, newColor);
        depthFirstSearch(image, sr, sc-1, originalColor, newColor);
        depthFirstSearch(image, sr, sc+1, originalColor, newColor);
    }
