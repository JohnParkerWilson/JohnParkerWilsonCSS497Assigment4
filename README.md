# JohnParkerWilsonCSS497Assigment4

Problem 1
To solve this problem I put the array through a hash map then used the hash map to organize the elements into a tree map which would give the target time complexity, then use that tree to grab from it the most frequent elements. Since it is a using tree that would put the time complexity at O(n logn) with a space complexity of O(log n).

Problem 2
In order to find the K closest elements I used an algorithm that was like a binary search, but instead of searching for one element, it would find a range of elements using the conditionals that were initially given as a problem then return that range as an array list. By doing a binary search the time complexity would be at O(log n) with a space complexity of O(1).

Problem 3
For this I put the array through a priority queue as I felt it was the best way to get the "Top K" kind of answer from an array. The function would go through the array, traversing it like a tree then adding the elements to the priority queue and polling the queue K times to get the top K elements. By using the priority queue the time complexity would be O(K log n) and the space complexity would be O(n).

Problem 4
To solve this, I used a similar kind of code which solved a similar problem in which I iterated through the array trying to sum up the elements and keeping track of which elements used for the sum while also trying to get a mininum sum, "dequeuing" elements from the equation until a minimum was reached. Iterating through the array would give a time complexity of O(n) and a space complexity of O(n)

Problem 5
To solve this, I used a priority queue as a min heap and put the possible fractions of the array into the priority queue. Then it would poll the queue k times in order to get the kth fraction. By using the priority queue along with polling the queue k times the time complexity would be O(kn log n) with a space complexity of O(n).
