I started off by creating an arraylist so that I can add the values that add up to 0 and then return that arraylist. I then sorted the array so that it is easier to skip the duplicates in the future. I used a for loop to iterate over the array minus the last 2 indexs because I have to check if 3 values are equal to 0. I then check if i is greater than 0 and if the value at index i is equal to the previous value. If both of those cases are true I move onto the while loop. Before the while loop I create two int variables to hold the indexes of the other 2 values. We start with an index one after i and the last index begins at the end of the array. We create a while loop to iterate until the pointer that starts at the end is less than the pointer that starts right after i. Inside the while loop I check if the sum of the values at the 3 pointers are equal to 0. If the values are equal to 0 I add them to an arraylist that I created at the beginning and then I turn that into a list and add that list into the arraylist. Inside the if statement to check if the sum is 0, I also check if the value of j is the same as the next one and I keep iterating until that isn't the case. After this I increase the value of j by 1 to make it a unique element. I do the same with the last pointer but with that pointer I decrease the value until there are no more duplicates. If the values are not equal to 0 we check if the value if greater than or less than 0. If it is greater than we change the pointer that starts at the end and we decrease it and if it less than 0 we change the pointer that is i+1 and increase that by 1 to increase the value of the sum. Because we sorted the array at the beginning we are able to increase either pointer based on how the big or small the sum is.