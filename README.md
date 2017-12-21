Matrix Vector Multiplication (HW3):
  input text files are vectors
  every vector is multiplied by the same special matrix, where for every row i and column j of the matrix:
    if j < i, then the matrix value at that position is 0
    otherwise, the matrix position at i,j is 1
  the Driver uses the Solution file to output the matrix-vector product
  sample input and output files for testing are provided

Depth First Search (HW4):
  input text files begin with a start node
  after the start node, each row of the text file corresponds to a node in the graph, and contains a list of nodes that share an edge with that particular node
  the Driver uses the Solution file to output an array, where every array index corresponds to a node's minimum distance from the given start node (for instance, index 0 corresponds to node 0's minimum distance from the start node)
  sample input and output files for testing are provided

Greedy (HW6):
  input text files begin with a number of tasks that must be scheduled
  after that, each row of the text file corresponds to a task, and contains a list of size 2, which contains the tasks's duration and deadline time
  the Driver uses the Solution file to output a schedule for the particular number of tasks -- if none exists, it outputs an empty array
  sample input and output files for testing are provided
  
Djikstra's Algorithm (HW7):
  input text files begin with a start node and an end node
  after these nodes are defined, each row of the text file corresponds to a node in the graph, and contains the node's weight, followed by a list of nodes that share an edge with that particular node
  the Driver uses the Solution file to output the cheapest/lighest path from the start node to the end node
  sample input and output files for testing are provided
  
Bellman-Ford Algorithm (HW 10):
  input text files begin with a start node
  after the start node, each row of the text file either contains a list of incoming or outgoing edges, for example, the first two rows after the start node contain node 0's incoming and outgoing edges, respectively 
  these lists also contains a weight for each edge designated by the list
  the Driver uses the Solution file to output the minimum path cost from the start node to all other nodes in the graph
  sample input and output files for testing are provided
