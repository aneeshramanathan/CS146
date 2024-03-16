def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        if image[sr][sc] == color:
            return image
        self.depthFirstSearch(image, sr, sc, image[sr][sc], color)
        return image
    def depthFirstSearch(self, image, sr, sc, originalColor, newColor):
        if sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]) or image[sr][sc] != originalColor:
            return
        image[sr][sc] = newColor
        self.depthFirstSearch(image, sr-1, sc, originalColor, newColor)
        self.depthFirstSearch(image, sr+1, sc, originalColor, newColor)
        self.depthFirstSearch(image, sr, sc-1, originalColor, newColor)
        self.depthFirstSearch(image, sr, sc+1, originalColor, newColor)
