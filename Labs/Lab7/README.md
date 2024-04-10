First we want to create a distance matrix for the direct distances between each node. We can set the diagonal to 0 because we don’t care about the distance from the city to itself
Then we can use Floyd-Marshall algorithm to fill in the rest of the matrix with the distances from the nodes that have to do through another node to find the total distance.
After that we want to find the occurrences under the threshold for each city, so we find the minimum value for ech city with distances under the threshold. 
At the end we return the city with the smallest count of connecting cities but also the city with the greatest value.

